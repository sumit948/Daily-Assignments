package com.resourceutilizationtool.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resourceutilizationtool.Enum.StatusEnum;
import com.resourceutilizationtool.customException.RecordNotFoundException;
import com.resourceutilizationtool.dto.CommonDTO;
import com.resourceutilizationtool.dto.EmployeeDTO;
import com.resourceutilizationtool.dto.PracticeTeamDTO;
import com.resourceutilizationtool.dto.ReportingManagerDTO;
import com.resourceutilizationtool.dto.StatusDTO;
import com.resourceutilizationtool.entity.Employee;
import com.resourceutilizationtool.entity.PracticeTeam;
import com.resourceutilizationtool.entity.ReportingManager;
import com.resourceutilizationtool.mapper.EmployeeMapper;
import com.resourceutilizationtool.mapper.PracticeTeamMapper;
import com.resourceutilizationtool.mapper.ReportingManagerMapper;
import com.resourceutilizationtool.repository.EmployeeRepository;
import com.resourceutilizationtool.repository.PracticeTeamRepository;
import com.resourceutilizationtool.repository.ReportingManagerRepository;
import com.resourceutilizationtool.utils.Message;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PracticeTeamRepository practiceTeamRepository;

	@Autowired
	private PracticeTeamMapper practiceTeamMapper;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private ReportingManagerMapper reportingManagerMapper;

	@Autowired
	private ReportingManagerRepository reportingManagerRepository;

	@Autowired
	private Message message;

	@Autowired
	private ModelMapper modelMapper;

	public List<PracticeTeamDTO> getPracticeTeam() {
		List<PracticeTeamDTO> practiceTeamDTOList = new ArrayList<>();
		List<PracticeTeam> practiceTeamList = practiceTeamRepository.findAll();
		if (!practiceTeamList.isEmpty()) {
			practiceTeamDTOList =
				practiceTeamList.stream().map(e -> practiceTeamMapper.toDto(e)).collect(Collectors.toList());
		}
		return practiceTeamDTOList;
	}

	public List<ReportingManagerDTO> getReportingManager() {
		List<ReportingManagerDTO> reportingManagerDTOList = new ArrayList<>();
		List<ReportingManager> reportingManagerList = reportingManagerRepository.findAll();
		if (!reportingManagerList.isEmpty()) {
			reportingManagerDTOList =
				reportingManagerList.stream().map(e -> reportingManagerMapper.toDto(e)).collect(Collectors.toList());
		}
		return reportingManagerDTOList;
	}

	public void createEmployeeDetails(EmployeeDTO employeeDTO) {
		Employee employee = employeeMapper.toEntity(employeeDTO);
		employee = employeeRepository.save(employee);
		if (employee.isReporter()) {
			ReportingManager reportingManager = new ReportingManager();
			reportingManager.setEmployeeId(employee.getEmployeeId());
			reportingManager.setPracticeId(employee.getPracticeId());
			reportingManager.setReportingManager(employee.getEmployeeName());
			reportingManagerRepository.save(reportingManager);
		}
	}

	public void deleteEmployeeBasedOnEmpNo(String empNo) throws RecordNotFoundException {
		Optional<Employee> employeeOpt = employeeRepository.findByEmpNo(empNo);
		if (!employeeOpt.isPresent()) {
			throw new RecordNotFoundException(message.getMessage("employee.not.found"));
		}
		employeeRepository.deleteByEmpNo(empNo);
		reportingManagerRepository.deleteByEmployeeId(employeeOpt.get().getEmployeeId());
	}

	public List<ReportingManagerDTO> getRMBasedOnPracticeTeam(String practiceId) throws RecordNotFoundException {
		List<ReportingManager> reportingManager = reportingManagerRepository.findByPracticeId(practiceId);
		return reportingManager.stream().map(e -> modelMapper.map(e, ReportingManagerDTO.class))
			.collect(Collectors.toList());
	}

	public void updateEmployeeDetails(EmployeeDTO employeeDTO) throws RecordNotFoundException {
		Optional<Employee> employeeOpt = employeeRepository.findByEmployeeId(employeeDTO.getEmployeeId());
		if (!employeeOpt.isPresent())
			throw new RecordNotFoundException(message.getMessage("employee.not.found"));
		Employee employee = modelMapper.map(employeeDTO, Employee.class);
		employeeRepository.save(employee);
		if (employee.isReporter()) {
			ReportingManager reportingManager = new ReportingManager();
			// reportingManagerRepository.findByEmployeeId(employee.getEmployeeId());
			reportingManager.setEmployeeId(employee.getEmployeeId());
			reportingManager.setPracticeId(employee.getPracticeId());
			reportingManager.setReportingManager(employee.getEmployeeName());
			reportingManagerRepository.save(reportingManager);
		} else {
			reportingManagerRepository.deleteByEmployeeId(employee.getEmployeeId());
		}
	}

	public CommonDTO getDetailsBasedOnRmAndPracticeTeam(String rmId, String practiceId) {
		CommonDTO commonDto = new CommonDTO();
		List<Employee> employeeList = new ArrayList<>();
		Optional<Employee> empOpt = employeeRepository.findByEmployeeId(rmId);
		if (rmId != null && !empOpt.get().isHeadOfTeam()) {
			employeeList = employeeRepository.findByRmIdAndPracticeId(rmId, practiceId);
			commonDto.setResponseList(employeeList);
			ReportingManager reportingManager = reportingManagerRepository.findByEmployeeId(rmId);
			Employee employee = employeeRepository.findByEmployeeName(reportingManager.getReportingManager());
			commonDto.setRmData(employee);
		} else if (rmId != null &&empOpt.get().isHeadOfTeam()) {
			List<Employee> mockemployeeList = new ArrayList<>();
			mockemployeeList = employeeRepository.findByPracticeId(practiceId);
			mockemployeeList.removeIf(t -> t.isHeadOfTeam() == true);
			employeeList = mockemployeeList;
			commonDto.setResponseList(employeeList);
			ReportingManager reportingManager = reportingManagerRepository.findByEmployeeId(rmId);
			Employee employee = employeeRepository.findByEmployeeName(reportingManager.getReportingManager());
			commonDto.setRmData(employee);
		} else {
			employeeList = employeeRepository.findByPracticeId(practiceId);
			commonDto.setResponseList(employeeList);
		}
		StatusDTO statusDTO = new StatusDTO();
		Long allocated = 0L;
		Long bench = 0L;
		Long blocked = 0L;
		for (Employee emp : employeeList) {
			if (StatusEnum.ALLOCATED.value().equals(emp.getStatus())) {
				allocated++;
			} else if (StatusEnum.BENCH.value().equals(emp.getStatus())) {
				bench++;
			} else if (StatusEnum.BLOCKED.value().equals(emp.getStatus())) {
				blocked++;
			}
		}
		statusDTO.setAllocated(allocated);
		statusDTO.setBench(bench);
		statusDTO.setBlocked(blocked);
		commonDto.setStatusDTO(statusDTO);
		return commonDto;
	}

	public CommonDTO getAllEmployeeDetails() {
		StatusDTO statusDTO = new StatusDTO();
		Long allocated = 0L;
		Long bench = 0L;
		Long blocked = 0L;
		CommonDTO commonDTO = new CommonDTO();
		List<Employee> employeeList = employeeRepository.findAll();
		commonDTO.setResponseList(employeeList);
		for (Employee emp : employeeList) {
			if (StatusEnum.ALLOCATED.value().equals(emp.getStatus())) {
				allocated++;
			} else if (StatusEnum.BENCH.value().equals(emp.getStatus())) {
				bench++;
			} else if (StatusEnum.BLOCKED.value().equals(emp.getStatus())) {
				blocked++;
			}
		}
		statusDTO.setAllocated(allocated);
		statusDTO.setBench(bench);
		statusDTO.setBlocked(blocked);
		commonDTO.setStatusDTO(statusDTO);
		return commonDTO;
	}

}

package com.resourceutilizationtool.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resourceutilizationtool.customException.RecordNotFoundException;
import com.resourceutilizationtool.dto.CommonDTO;
import com.resourceutilizationtool.dto.EmployeeDTO;
import com.resourceutilizationtool.dto.PracticeTeamDTO;
import com.resourceutilizationtool.dto.ReportingManagerDTO;
import com.resourceutilizationtool.service.EmployeeService;
import com.resourceutilizationtool.utils.Message;
import com.resourceutilizationtool.utils.ResponseBody;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/resource-utilization-tool")
@Transactional
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private Message message;

	@GetMapping(value = "/get-practice-team")
	@ApiOperation(value = "Get Practice Team")
	public ResponseEntity<List<PracticeTeamDTO>> getPracticeTeam() {
		return new ResponseEntity<>(employeeService.getPracticeTeam(), HttpStatus.OK);
	}

	@GetMapping(value = "/get-reporting-manager")
	@ApiOperation(value = "Get Reporting Manager")
	public ResponseEntity<List<ReportingManagerDTO>> getReportingManager() {
		return new ResponseEntity<>(employeeService.getReportingManager(), HttpStatus.OK);
	}

	@GetMapping(value = "/get-reporting-Manager/{practiceId}")
	@ApiOperation(value = "Get Reporting Manager Based on PracticeId")
	public ResponseEntity<List<ReportingManagerDTO>> getRMBasedOnPracticeTeam(@PathVariable String practiceId)
		throws RecordNotFoundException {
		return ResponseEntity.ok(employeeService.getRMBasedOnPracticeTeam(practiceId));
	}

	@PostMapping("/create-employee-details")
	@ApiOperation(value = "Create Employee Details")
	public ResponseEntity<ResponseBody> createEmployeeDetails(@RequestBody EmployeeDTO employeeDTO) {
		employeeService.createEmployeeDetails(employeeDTO);
		return ResponseEntity.ok().body(new ResponseBody(HttpStatus.OK.value(), message.getMessage("employee.add")));
	}

	@PutMapping("/update-employee-details")
	@ApiOperation(value = "Update Employee Details")
	public ResponseEntity<ResponseBody> updateEmployeeDetails(@RequestBody EmployeeDTO employeeDTO)
		throws RecordNotFoundException {
		employeeService.updateEmployeeDetails(employeeDTO);
		return ResponseEntity.ok().body(new ResponseBody(HttpStatus.OK.value(), message.getMessage("employee.update")));
	}

	@DeleteMapping("/delete-employee/{empNo}")
	@ApiOperation(value = "Delete Employee Details Based on EmpNo")
	public ResponseEntity<ResponseBody> deleteEmployee(@PathVariable String empNo) throws RecordNotFoundException {
		employeeService.deleteEmployeeBasedOnEmpNo(empNo);
		return ResponseEntity.ok().body(new ResponseBody(HttpStatus.OK.value(), message.getMessage("employee.delete")));
	}

	@GetMapping(value = "/get-reportingManager-practice")
	@ApiOperation(value = "Get Employee Details Based on RmID and PracticeId")
	public ResponseEntity<CommonDTO> getDetailsBasedOnRmAndPracticeTeam(@RequestParam String practiceId, @RequestParam(required = false) String rmId
			) {
		return new ResponseEntity<>(employeeService.getDetailsBasedOnRmAndPracticeTeam(rmId, practiceId),
			HttpStatus.OK);
	}

	@GetMapping(value = "/get-all-employeeData")
	@ApiOperation(value = "Get All Employee Details")
	public ResponseEntity<CommonDTO> getAllEmployeeDetails() {
		return new ResponseEntity<>(employeeService.getAllEmployeeDetails(), HttpStatus.OK);
	}

}

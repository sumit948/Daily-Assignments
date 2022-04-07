package com.resourceutilizationtool.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resourceutilizationtool.dto.EmployeeDTO;
import com.resourceutilizationtool.entity.Employee;

@Component
public class EmployeeMapper {

	@Autowired
	private ModelMapper modelMapper;

	public EmployeeDTO toDto(Employee employee) {
		return modelMapper.map(employee, EmployeeDTO.class);
	}

	public Employee toEntity(EmployeeDTO employeeDTO) {
		return modelMapper.map(employeeDTO, Employee.class);
	}

	public Employee toDto(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		return null;
	}
}

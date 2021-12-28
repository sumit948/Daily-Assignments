package com.example.testingwithspringboot.Week4.springboottesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.testingwithspringboot.Week4.springboottesting.Repository.EmployeeRepository;
import com.example.testingwithspringboot.Week4.springboottesting.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	public Employee addEmployee(Employee emp) {
//		Employee employee = new Employee();
//		employee.setEmployeeName("Jhon Weak");
//		employee.setEmployeeRole("Associate");
//		employee.setEmployeeDept("EAD");
		return emp;
	}
}

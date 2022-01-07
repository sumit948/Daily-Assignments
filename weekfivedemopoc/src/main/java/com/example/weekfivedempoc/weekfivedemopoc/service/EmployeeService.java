package com.example.weekfivedempoc.weekfivedemopoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weekfivedempoc.weekfivedemopoc.entity.Employee;
import com.example.weekfivedempoc.weekfivedemopoc.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	public List<Employee> getCall() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	public Employee createCall(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}
}

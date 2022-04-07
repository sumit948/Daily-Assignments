package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo empRepo;
	
	@PostMapping("/create-emp")
	private Employee createEmp(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@GetMapping("/get-all-emp")
	private List<Employee> getEmp(){
		return empRepo.findAll();
	}
}

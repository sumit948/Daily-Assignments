package com.example.testingwithspringboot.Week4.springboottesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testingwithspringboot.Week4.springboottesting.entity.Employee;
import com.example.testingwithspringboot.Week4.springboottesting.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empServ;
	
	@PostMapping("/")
	public String addRecord(@RequestBody Employee emp) {
		empServ.addEmployee(emp);
		return "Go";
	}
}

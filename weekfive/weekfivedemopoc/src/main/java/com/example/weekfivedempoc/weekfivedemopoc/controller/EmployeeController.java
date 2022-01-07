package com.example.weekfivedempoc.weekfivedemopoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.weekfivedempoc.weekfivedemopoc.entity.Employee;
import com.example.weekfivedempoc.weekfivedemopoc.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empServ;
	
	@PostMapping("/create")
	private Employee createCall(@RequestBody Employee emp) {
		return empServ.createCall(emp);
	}
	
	@GetMapping("/get-call")
	private List<Employee> getCall(){
		return empServ.getCall();
	}
}

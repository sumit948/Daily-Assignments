package com.example.hibernateemployee.Week3.hibernateemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernateemployee.Week3.hibernateemployee.Entity.Employee;
import com.example.hibernateemployee.Week3.hibernateemployee.repository.EmployeeRepository;

@RestController
public class EmployeeController {
		@Autowired
		EmployeeRepository empRepo;
		
		@PostMapping("/create-employee")
		public Employee createEmployee(@RequestBody Employee emp) {
			Employee e = empRepo.save(emp);
			return e;
		}
		
		@PutMapping("/create-employee")
		public Employee updateEmployee(@RequestBody Employee emp) {
			Employee e = empRepo.save(emp);
			return e;
		}
		
		@DeleteMapping("/delete-employee")
		public String deleteEmployee(@RequestBody Employee emp) {
			empRepo.delete(emp);
			return "Employee Deleted";
		}
		
		@GetMapping("/get-All-Employees")
		public List<Employee> getEmployees(){
			return empRepo.findAll();
		}
}

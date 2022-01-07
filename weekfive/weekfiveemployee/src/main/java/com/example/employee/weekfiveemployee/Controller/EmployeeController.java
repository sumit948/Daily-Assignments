package com.example.employee.weekfiveemployee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.weekfiveemployee.Entity.Employee;
import com.example.employee.weekfiveemployee.Repository.EmployeeRepository;
import com.example.employee.weekfiveemployee.common.Department;
import com.example.employee.weekfiveemployee.common.RequestEmployee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/create-employee")
	private Employee createCall(@RequestBody RequestEmployee reqEmp) {
		Employee emp = reqEmp.emp;
		Department dept = reqEmp.dept;
		dept.setEmpId(emp.getEmployeeId());
		return empRepo.saveEmployee(emp);
	}
	
	@PutMapping("/update-call")
	private Employee updateCall(@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
	
	@DeleteMapping("/delete-employee")
	private String deleteCall(@RequestBody Employee emp) {
		empRepo.delete(emp);
		return "Employee Deleted";
	}
	
	@GetMapping("/get-allEmployee")
	private List<Employee> getCall(){
		return empRepo.findAll();
	}
}

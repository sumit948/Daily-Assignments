package com.example.testingwithspringboot.Week4.springboottesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.testingwithspringboot.Week4.springboottesting.Repository.EmployeeRepository;
import com.example.testingwithspringboot.Week4.springboottesting.controller.EmployeeController;
import com.example.testingwithspringboot.Week4.springboottesting.entity.Employee;
import com.example.testingwithspringboot.Week4.springboottesting.service.EmployeeService;

@SpringBootTest
public class EmployeeTests {
	@Autowired
	private EmployeeController empCon = new EmployeeController();
	
	@Autowired
	private EmployeeService empServ = new EmployeeService();
	
	@Test
	public void testAddCall1() {
		Employee emp = new Employee();
		assertEquals("Go", empCon.addRecord(emp));
	}
	@Test
	public void testAddCall() {
		Employee emp = new Employee();
		assertEquals(emp, empServ.addEmployee(emp));
	}
}

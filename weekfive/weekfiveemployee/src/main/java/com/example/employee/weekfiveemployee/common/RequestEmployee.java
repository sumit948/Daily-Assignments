package com.example.employee.weekfiveemployee.common;

import com.example.employee.weekfiveemployee.Entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestEmployee {
	public Employee emp;
	public Department dept;
	
}	

package com.example.testingwithspringboot.Week4.springboottesting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testingwithspringboot.Week4.springboottesting.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}

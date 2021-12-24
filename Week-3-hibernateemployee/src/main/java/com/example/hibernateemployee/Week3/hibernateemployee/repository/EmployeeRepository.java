package com.example.hibernateemployee.Week3.hibernateemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernateemployee.Week3.hibernateemployee.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}

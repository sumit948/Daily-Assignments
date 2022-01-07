package com.example.department.weekfivedepartment.Reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.department.weekfivedepartment.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

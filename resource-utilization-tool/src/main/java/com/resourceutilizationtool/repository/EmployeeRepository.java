package com.resourceutilizationtool.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceutilizationtool.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	Optional<Employee> findByEmpNo(String empNo);

	void deleteByEmpNo(String empNo);

	Optional<Employee> findByEmployeeId(String employeeId);

	List<Employee> findByRmIdAndPracticeId(String rmId, String practiceId);

	Employee findByEmployeeName(String reportingManager);

	List<Employee> findByPracticeId(String practiceId);
}

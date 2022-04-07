package com.resourceutilizationtool.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resourceutilizationtool.entity.ReportingManager;

@Repository
public interface ReportingManagerRepository extends JpaRepository<ReportingManager, String> {

	ReportingManager findByEmployeeId(String rmId);

	List<ReportingManager> findByPracticeId(String practiceId);

	void deleteByEmployeeId(String employeeId);
}

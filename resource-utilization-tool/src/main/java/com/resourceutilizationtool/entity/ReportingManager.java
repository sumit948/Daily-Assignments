package com.resourceutilizationtool.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "reporting_manager")
public class ReportingManager {

	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "rm_id")
	@Id
	private String rmId;

	@Column(name = "reporting_manager")
	private String reportingManager;

	@Column(name = "practice_id")
	private String practiceId;

	@Column(name = "employee_id")
	private String employeeId;

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getPracticeId() {
		return practiceId;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}

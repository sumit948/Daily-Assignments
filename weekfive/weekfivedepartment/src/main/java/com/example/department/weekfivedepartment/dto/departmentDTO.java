package com.example.department.weekfivedepartment.dto;

public class departmentDTO {
	private String departmentName;
	
	private String departmentEmail;
	
	private String paymentStatus;
	
	private Long empId;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentEmail() {
		return departmentEmail;
	}

	public void setDepartmentEmail(String departmentEmail) {
		this.departmentEmail = departmentEmail;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "departmentDTO [departmentName=" + departmentName + ", departmentEmail=" + departmentEmail
				+ ", paymentStatus=" + paymentStatus + ", empId=" + empId + "]";
	}
	
	
}

package com.example.employee.weekfiveemployee.common;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department{

	
	private Long departmentId;

	private String departmentName;
	
	private String departmentEmail;
	
	private String paymentStatus;
	
	private Long empId;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

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
	public int hashCode() {
		return Objects.hash(departmentEmail, departmentId, departmentName, empId, paymentStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentEmail, other.departmentEmail)
				&& Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(departmentName, other.departmentName) && Objects.equals(empId, other.empId)
				&& Objects.equals(paymentStatus, other.paymentStatus);
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentEmail="
				+ departmentEmail + ", paymentStatus=" + paymentStatus + ", empId=" + empId + "]";
	}

	

	

}

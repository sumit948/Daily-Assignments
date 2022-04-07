package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10000L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeID;
	
	@Column
	private String employeeName;
	
	private String employeeAdd;
	
	private Long employeeContact;
	
	private String employeeDepartment;
	
	private boolean isOnProject;

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAdd() {
		return employeeAdd;
	}

	public void setEmployeeAdd(String employeeAdd) {
		this.employeeAdd = employeeAdd;
	}

	public Long getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(Long employeeContact) {
		this.employeeContact = employeeContact;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public boolean isOnProject() {
		return isOnProject;
	}

	public void setOnProject(boolean isOnProject) {
		this.isOnProject = isOnProject;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeAdd, employeeContact, employeeDepartment, employeeID, employeeName, isOnProject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeAdd, other.employeeAdd) && Objects.equals(employeeContact, other.employeeContact)
				&& Objects.equals(employeeDepartment, other.employeeDepartment)
				&& Objects.equals(employeeID, other.employeeID) && Objects.equals(employeeName, other.employeeName)
				&& isOnProject == other.isOnProject;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeAdd=" + employeeAdd
				+ ", employeeContact=" + employeeContact + ", employeeDepartment=" + employeeDepartment
				+ ", isOnProject=" + isOnProject + "]";
	}

	
}

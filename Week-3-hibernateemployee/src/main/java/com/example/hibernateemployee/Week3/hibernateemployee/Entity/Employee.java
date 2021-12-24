package com.example.hibernateemployee.Week3.hibernateemployee.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Column
	private String employeeName;
	
	private String employeeDepartment;
	
	private String employeeRole;
	
	private String employeeemail;
	
	private Long employeePhoneNo;
	
	private boolean isOnProject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getEmployeeemail() {
		return employeeemail;
	}

	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	public Long getEmployeePhoneNo() {
		return employeePhoneNo;
	}

	public void setEmployeePhoneNo(Long employeePhoneNo) {
		this.employeePhoneNo = employeePhoneNo;
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
		return Objects.hash(employeeDepartment, employeeName, employeePhoneNo, employeeRole, employeeemail, id,
				isOnProject);
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
		return Objects.equals(employeeDepartment, other.employeeDepartment)
				&& Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(employeePhoneNo, other.employeePhoneNo)
				&& Objects.equals(employeeRole, other.employeeRole)
				&& Objects.equals(employeeemail, other.employeeemail) && Objects.equals(id, other.id)
				&& isOnProject == other.isOnProject;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment
				+ ", employeeRole=" + employeeRole + ", employeeemail=" + employeeemail + ", employeePhoneNo="
				+ employeePhoneNo + ", isOnProject=" + isOnProject + "]";
	}

	
	
	
}

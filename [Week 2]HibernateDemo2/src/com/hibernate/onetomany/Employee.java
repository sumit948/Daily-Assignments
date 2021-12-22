package com.hibernate.onetomany;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table()
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="EmployeeId")
	private Integer employeeId;
	@Column(name="EmpName")
    private String empName;
 
    @Column(name="EmpAddress")
    private String empAddress;
 
    @Column(name="EmpContact")
    private long empContact;

//    @OneToOne(cascade = CascadeType.ALL) // perform Operation on the child class
//    private Laptop laptop;
    @OneToMany(cascade = CascadeType.ALL)
    private List<MobilePhone> mp;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	public List<MobilePhone> getMp() {
		return mp;
	}

	public void setMp(List<MobilePhone> mp) {
		this.mp = mp;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empContact, empName, employeeId, mp);
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
		return Objects.equals(empAddress, other.empAddress) && empContact == other.empContact
				&& Objects.equals(empName, other.empName) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(mp, other.mp);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", empContact=" + empContact + ", mp=" + mp + "]";
	}
    

}

package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deparment extends AuditModel implements Serializable {
	private static final long serialVersionUID = -1606169901038082721L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dptID;
    private Long deptName;
	public Long getDptID() {
		return dptID;
	}
	public void setDptID(Long dptID) {
		this.dptID = dptID;
	}
	public Long getDeptName() {
		return deptName;
	}
	public void setDeptName(Long deptName) {
		this.deptName = deptName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(deptName, dptID);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deparment other = (Deparment) obj;
		return Objects.equals(deptName, other.deptName) && Objects.equals(dptID, other.dptID);
	}
	@Override
	public String toString() {
		return "Deparment [dptID=" + dptID + ", deptName=" + deptName + "]";
	}
    
    
}	

package com.program.hibernateformobile;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobilePhone {
	@Id
	private String mobileID;
	private String mobileName;
	private String mobileVersion;
	private Double mobilePrise;
	public String getMobileID() {
		return mobileID;
	}
	public void setMobileID(String mobileID) {
		this.mobileID = mobileID;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileVersion() {
		return mobileVersion;
	}
	public void setMobileVersion(String mobileVersion) {
		this.mobileVersion = mobileVersion;
	}
	public Double getMobilePrise() {
		return mobilePrise;
	}
	public void setMobilePrise(Double mobilePrise) {
		this.mobilePrise = mobilePrise;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mobileID, mobileName, mobilePrise, mobileVersion);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobilePhone other = (MobilePhone) obj;
		return Objects.equals(mobileID, other.mobileID) && Objects.equals(mobileName, other.mobileName)
				&& Objects.equals(mobilePrise, other.mobilePrise) && Objects.equals(mobileVersion, other.mobileVersion);
	}
	@Override
	public String toString() {
		return "MobilePhone [mobileID=" + mobileID + ", mobileName=" + mobileName + ", mobileVersion=" + mobileVersion
				+ ", mobilePrise=" + mobilePrise + "]";
	}
				
}

package com.hibernate.onetomany;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MobilePhone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long phoneId;
	@Column
    private String phoneNumber;
	@Column
	private String phoneName;
	public Long getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(phoneId, phoneName, phoneNumber);
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
		return Objects.equals(phoneId, other.phoneId) && Objects.equals(phoneName, other.phoneName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	@Override
	public String toString() {
		return "MobilePhone [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", phoneName=" + phoneName + "]";
	}
	
}

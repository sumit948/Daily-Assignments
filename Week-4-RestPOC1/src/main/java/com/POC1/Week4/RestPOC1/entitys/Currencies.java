package com.POC1.Week4.RestPOC1.entitys;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currencies implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long currencyId;
	
	private String nameCurrency;

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public String getNameCurrency() {
		return nameCurrency;
	}

	public void setNameCurrency(String nameCurrency) {
		this.nameCurrency = nameCurrency;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currencyId, nameCurrency);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currencies other = (Currencies) obj;
		return Objects.equals(currencyId, other.currencyId) && Objects.equals(nameCurrency, other.nameCurrency);
	}

	@Override
	public String toString() {
		return "Currencies [currencyId=" + currencyId + ", nameCurrency=" + nameCurrency + "]";
	}
	
	
}

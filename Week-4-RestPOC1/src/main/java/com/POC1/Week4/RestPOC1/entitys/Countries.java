package com.POC1.Week4.RestPOC1.entitys;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Countries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long countryId;
	
	@Column
	private String countriesName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Customers> cutomers;

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountriesName() {
		return countriesName;
	}

	public void setCountriesName(String countriesName) {
		this.countriesName = countriesName;
	}

	public Set<Customers> getCutomers() {
		return cutomers;
	}

	public void setCutomers(Set<Customers> cutomers) {
		this.cutomers = cutomers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countriesName, countryId, cutomers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countries other = (Countries) obj;
		return Objects.equals(countriesName, other.countriesName) && Objects.equals(countryId, other.countryId)
				&& Objects.equals(cutomers, other.cutomers);
	}

	@Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countriesName=" + countriesName + ", cutomers=" + cutomers
				+ "]";
	}
	
	

}

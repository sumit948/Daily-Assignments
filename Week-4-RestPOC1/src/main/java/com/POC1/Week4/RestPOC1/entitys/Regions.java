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
public class Regions implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regionId;
	
	@Column
	private String regionName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Countries> countries;

	public Long getRegionId() {
		return regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public Set<Countries> getCountries() {
		return countries;
	}

	public void setCountries(Set<Countries> countries) {
		this.countries = countries;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countries, regionId, regionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regions other = (Regions) obj;
		return Objects.equals(countries, other.countries) && Objects.equals(regionId, other.regionId)
				&& Objects.equals(regionName, other.regionName);
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", regionName=" + regionName + ", countries=" + countries + "]";
	}
	
	
}

package com.example.apiPOC.Week4.apiPOC.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ApiEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long apiId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "year")
	private Long year;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "pantone_value")
	private String pantone_value;

	public Long getApiId() {
		return apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPantone_value() {
		return pantone_value;
	}

	public void setPantone_value(String pantone_value) {
		this.pantone_value = pantone_value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apiId, color, name, pantone_value, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiEntity other = (ApiEntity) obj;
		return Objects.equals(apiId, other.apiId) && Objects.equals(color, other.color)
				&& Objects.equals(name, other.name) && Objects.equals(pantone_value, other.pantone_value)
				&& Objects.equals(year, other.year);
	}

	@Override
	public String toString() {
		return "ApiEntity [apiId=" + apiId + ", name=" + name + ", year=" + year + ", color=" + color
				+ ", pantone_value=" + pantone_value + "]";
	}

	
		
}

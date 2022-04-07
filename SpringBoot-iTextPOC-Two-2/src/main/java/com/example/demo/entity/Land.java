package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Land implements Serializable {
	
	@Id
	@Column
	private String name;

	public Land() {
		super();
	}

	public Land(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Land other = (Land) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Land [name=" + name + "]";
	}
	
	

}

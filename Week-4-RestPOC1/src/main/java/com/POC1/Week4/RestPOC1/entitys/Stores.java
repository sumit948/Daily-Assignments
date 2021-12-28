package com.POC1.Week4.RestPOC1.entitys;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Stores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String storesId;
	@Column
	private String storesName;
	
	private String emailStores;
	
	private String phoneStores;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Products> products = new HashSet<Products>();

	public String getStoresId() {
		return storesId;
	}

	public void setStoresId(String storesId) {
		this.storesId = storesId;
	}

	public String getStoresName() {
		return storesName;
	}

	public void setStoresName(String storesName) {
		this.storesName = storesName;
	}

	public String getEmailStores() {
		return emailStores;
	}

	public void setEmailStores(String emailStores) {
		this.emailStores = emailStores;
	}

	public String getPhoneStores() {
		return phoneStores;
	}

	public void setPhoneStores(String phoneStores) {
		this.phoneStores = phoneStores;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailStores, phoneStores, products, storesId, storesName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		return Objects.equals(emailStores, other.emailStores) && Objects.equals(phoneStores, other.phoneStores)
				&& Objects.equals(products, other.products) && Objects.equals(storesId, other.storesId)
				&& Objects.equals(storesName, other.storesName);
	}

	@Override
	public String toString() {
		return "Stores [storesId=" + storesId + ", storesName=" + storesName + ", emailStores=" + emailStores
				+ ", phoneStores=" + phoneStores + ", products=" + products + "]";
	}

	
	
}

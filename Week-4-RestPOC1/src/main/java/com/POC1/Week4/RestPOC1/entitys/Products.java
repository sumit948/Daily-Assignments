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
public class Products implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@Column
	private String productName;
	private String shortDescription;
	private String fullDescription;
	private String size;
	private String color;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Stores> stores = new HashSet<Stores>();

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Stores> getStores() {
		return stores;
	}

	public void setStores(Set<Stores> stores) {
		this.stores = stores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, fullDescription, productId, productName, shortDescription, size, stores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(color, other.color) && Objects.equals(fullDescription, other.fullDescription)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(size, other.size)
				&& Objects.equals(stores, other.stores);
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", shortDescription="
				+ shortDescription + ", fullDescription=" + fullDescription + ", size=" + size + ", color=" + color
				+ ", stores=" + stores + "]";
	}
	
	
}

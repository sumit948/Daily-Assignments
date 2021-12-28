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
import javax.persistence.OneToOne;

@Entity
public class Sales implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long salesId;
	
	@Column
	private String salesChannel;
	private String orderNumber;
	private String netAmount;
	private String tax;
	private String shippingCost;
	private String grossAmount;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Currencies> currencies;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Products> products;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Stores stores;

	public Long getSalesId() {
		return salesId;
	}

	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(String grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Set<Currencies> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(Set<Currencies> currencies) {
		this.currencies = currencies;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currencies, grossAmount, netAmount, orderNumber, products, salesChannel, salesId,
				shippingCost, stores, tax);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sales other = (Sales) obj;
		return Objects.equals(currencies, other.currencies) && Objects.equals(grossAmount, other.grossAmount)
				&& Objects.equals(netAmount, other.netAmount) && Objects.equals(orderNumber, other.orderNumber)
				&& Objects.equals(products, other.products) && Objects.equals(salesChannel, other.salesChannel)
				&& Objects.equals(salesId, other.salesId) && Objects.equals(shippingCost, other.shippingCost)
				&& Objects.equals(stores, other.stores) && Objects.equals(tax, other.tax);
	}

	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", salesChannel=" + salesChannel + ", orderNumber=" + orderNumber
				+ ", netAmount=" + netAmount + ", tax=" + tax + ", shippingCost=" + shippingCost + ", grossAmount="
				+ grossAmount + ", currencies=" + currencies + ", products=" + products + ", stores=" + stores + "]";
	}
	
	
}

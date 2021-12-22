package com.POC1.Order;

public class Order {
	private Customer cust;
	private Product product;
	private String orderID;
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Order [cust=" + cust + ", product=" + product + ", orderID=" + orderID + "]";
	}
	
	
}

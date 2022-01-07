package com.example.order.orderweekfive.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ORDER_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
		@Id
		private int id;
		private String orderName;
		private int qty;
		private double price;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getOrderName() {
			return orderName;
		}
		public void setOrderName(String orderName) {
			this.orderName = orderName;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, orderName, price, qty);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Order other = (Order) obj;
			return id == other.id && Objects.equals(orderName, other.orderName)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && qty == other.qty;
		}
		@Override
		public String toString() {
			return "Order [id=" + id + ", orderName=" + orderName + ", qty=" + qty + ", price=" + price + "]";
		}
		
		
}

package com.example.order.orderweekfive.common;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {
	
	private int paymentId;
	
	private String paymentStatus;
	
	private String transactionId;

	private int orderId;
	
	private double amount;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, orderId, paymentId, paymentStatus, transactionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentEntity other = (PaymentEntity) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && orderId == other.orderId
				&& paymentId == other.paymentId && Objects.equals(paymentStatus, other.paymentStatus)
				&& Objects.equals(transactionId, other.transactionId);
	}

	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", paymentStatus=" + paymentStatus + ", transactionId="
				+ transactionId + ", orderId=" + orderId + ", amount=" + amount + "]";
	}

		
	
}

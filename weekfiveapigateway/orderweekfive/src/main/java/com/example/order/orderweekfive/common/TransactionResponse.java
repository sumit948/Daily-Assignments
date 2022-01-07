package com.example.order.orderweekfive.common;

import com.example.order.orderweekfive.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
	
	private Order order;
	private double amount;
	private String transactionId;
	private String message;
	public TransactionResponse(Order order, double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	
	
}

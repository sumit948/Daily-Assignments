package com.example.order.orderweekfive.common;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.order.orderweekfive.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {
	private Order order;
	
	private PaymentEntity payment;

	public Order getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public PaymentEntity getPaymentEntity() {
		// TODO Auto-generated method stub
		return null;
	}
}

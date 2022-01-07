package com.example.order.orderweekfive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.orderweekfive.common.PaymentEntity;
import com.example.order.orderweekfive.common.TransactionRequest;
import com.example.order.orderweekfive.common.TransactionResponse;
import com.example.order.orderweekfive.entity.Order;
import com.example.order.orderweekfive.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderServ;
	
	@PostMapping("/bookorder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		
		return orderServ.saveOrder(request);
	}
}

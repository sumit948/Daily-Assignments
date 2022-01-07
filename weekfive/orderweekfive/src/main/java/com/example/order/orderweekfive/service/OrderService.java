package com.example.order.orderweekfive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.order.orderweekfive.common.PaymentEntity;
import com.example.order.orderweekfive.common.TransactionRequest;
import com.example.order.orderweekfive.common.TransactionResponse;
import com.example.order.orderweekfive.entity.Order;
import com.example.order.orderweekfive.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public TransactionResponse saveOrder(TransactionRequest request) {
		String response = "";
		Order order = request.getOrder();
		PaymentEntity payEn = request.getPaymentEntity();
		payEn.setOrderId(order.getId());
		payEn.setAmount(order.getPrice());
		//rest call
		PaymentEntity paymentResponse = restTemplate.postForObject("http://localhost:9092/payment/pay", payEn, PaymentEntity.class);
		response = paymentResponse.getPaymentStatus().equals("success" != null)?"payment proccessing done and orde placed":"there is a failuer";
		return new TransactionResponse(order,paymentResponse.getAmount(),paymentResponse.getTransactionId(),response);
	}
}

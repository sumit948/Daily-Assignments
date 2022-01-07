package com.example.paymentservices.paymentserviceweekfive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentservices.paymentserviceweekfive.entity.PaymentEntity;
import com.example.paymentservices.paymentserviceweekfive.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService payServ;
	
	@PostMapping("/pay")
	public PaymentEntity doPayment(@RequestBody PaymentEntity payEn) {
		return payServ.doPayment(payEn);
	}
}

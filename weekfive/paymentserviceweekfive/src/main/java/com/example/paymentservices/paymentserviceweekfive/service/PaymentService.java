package com.example.paymentservices.paymentserviceweekfive.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentservices.paymentserviceweekfive.entity.PaymentEntity;
import com.example.paymentservices.paymentserviceweekfive.reposiotry.PaymentReposiotry;

@Service
public class PaymentService {
	@Autowired
	private PaymentReposiotry payRepo;
	
	public PaymentEntity doPayment(PaymentEntity pay) {
		pay.setPaymentStatus(paymentProccessing());
		pay.setTransactionId(UUID.randomUUID().toString());
		return payRepo.save(pay);
	}
	
	public String paymentProccessing() {
		//api should be third party gateway(paypal)
		return new Random().nextBoolean()?"success":"False";
	}
}

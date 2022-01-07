package com.example.paymentservices.paymentserviceweekfive.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paymentservices.paymentserviceweekfive.entity.PaymentEntity;

@Repository
public interface PaymentReposiotry extends JpaRepository<PaymentEntity, Integer> {

}

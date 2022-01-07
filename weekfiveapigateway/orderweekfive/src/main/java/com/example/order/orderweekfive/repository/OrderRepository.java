package com.example.order.orderweekfive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.orderweekfive.common.TransactionRequest;
import com.example.order.orderweekfive.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	Order save(TransactionRequest order);

}

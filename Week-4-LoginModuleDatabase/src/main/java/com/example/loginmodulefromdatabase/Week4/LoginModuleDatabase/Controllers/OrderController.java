package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys.Order;
import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Repositories.OrderRepository;

@RestController
public class OrderController {
	@Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
    @PostMapping("/order")
    public Order addOrders(@RequestBody Order order){
        return orderRepository.save(order);
    }
    @PutMapping("/order")
    public Order updateOrders(@RequestBody Order order){
        return orderRepository.save(order);
    }
    @DeleteMapping("/order")
    public List<Order> deleteOrders(){
        return orderRepository.findAll();
    }
}


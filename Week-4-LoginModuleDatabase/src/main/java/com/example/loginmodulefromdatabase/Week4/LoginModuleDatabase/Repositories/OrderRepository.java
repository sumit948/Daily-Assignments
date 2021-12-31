package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys.Order;

@Repository
public interface OrderRepository extends  JpaRepository<Order, Long>{

}

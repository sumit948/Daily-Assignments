package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

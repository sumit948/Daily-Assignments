package com.POC1.Week4.RestPOC1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.POC1.Week4.RestPOC1.entitys.Countries;
import com.POC1.Week4.RestPOC1.entitys.Products;
import com.POC1.Week4.RestPOC1.repositories.ProductsRepository;

@RestController
public class ProductsController {
		@Autowired
		private ProductsRepository productRepo;
		
		@PostMapping("/create-product")
		public Products createCountry(@RequestBody Products prod) {
		return productRepo.save(prod);
		}
	
		@PutMapping("/create-product")
		public Products updateCountry(@RequestBody Products prod) {
		return productRepo.save(prod);
		}
	
		@DeleteMapping("delete-product")
		public String deleteCountry(@RequestBody Products con) {
		productRepo.delete(con);
		return "Product Deleted";
		}
	
		@GetMapping("/get-All-product")
		public List<Products> getCountries(){
		return productRepo.findAll();
	}
}	

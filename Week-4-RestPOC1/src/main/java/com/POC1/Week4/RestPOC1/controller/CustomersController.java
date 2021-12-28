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
import com.POC1.Week4.RestPOC1.entitys.Customers;
import com.POC1.Week4.RestPOC1.repositories.CustomersRepository;

@RestController
public class CustomersController {
	@Autowired
	private CustomersRepository custRepo;
	
	@PostMapping("/create-Customer")
	public Customers createCountry(@RequestBody Customers cust) {
		return custRepo.save(cust);
	}
	
	@PutMapping("/create-Customer")
	public Customers updateCountry(@RequestBody Customers cust) {
		return custRepo.save(cust);
	}
	
	@DeleteMapping("delete-Customer")
	public String deleteCountry(@RequestBody Customers con) {
		custRepo.delete(con);
		return "Customer Deleted";
	}
	
	@GetMapping("/get-All-Customer")
	public List<Customers> getCountries(){
		return custRepo.findAll();
	}
}

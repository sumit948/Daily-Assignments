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
import com.POC1.Week4.RestPOC1.entitys.Sales;
import com.POC1.Week4.RestPOC1.repositories.SalersRepository;

@RestController
public class SalesController {
	@Autowired
	private SalersRepository saleRepo;
	
	@PostMapping("/create-Sales")
	public Sales createSale(@RequestBody Sales sale) {
		return saleRepo.save(sale);
	}
	
	@PutMapping("/create-Sales")
	public Sales updateSale(@RequestBody Sales sale) {
		return saleRepo.save(sale);
	}
	
	@DeleteMapping("delete-Sales")
	public String deleteSale(@RequestBody Sales con) {
		saleRepo.delete(con);
		return "Sales Deleted";
	}
	
	@GetMapping("/get-All-Sales")
	public List<Sales> getSales(){
		return saleRepo.findAll();
	}
			
}

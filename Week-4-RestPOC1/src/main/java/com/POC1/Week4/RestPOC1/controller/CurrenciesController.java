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
import com.POC1.Week4.RestPOC1.entitys.Currencies;
import com.POC1.Week4.RestPOC1.repositories.CurrenciesRepository;

@RestController
public class CurrenciesController {
	@Autowired
	private CurrenciesRepository curntRepo;
	
	@PostMapping("/create-Currencies")
	public Currencies createCurrencies(@RequestBody Currencies curren) {
		return curntRepo.save(curren);
	}
	
	@PutMapping("/create-Currencies")
	public Currencies updateCurrencies(@RequestBody Currencies curren) {
		return curntRepo.save(curren);
	}
	
	@DeleteMapping("delete-Currencies")
	public String deleteCurrencies(@RequestBody Currencies con) {
		curntRepo.delete(con);
		return "Currencies Deleted";
	}
	
	@GetMapping("/get-All-Currencies")
	public List<Currencies> getCountries(){
		return curntRepo.findAll();
	}
}	

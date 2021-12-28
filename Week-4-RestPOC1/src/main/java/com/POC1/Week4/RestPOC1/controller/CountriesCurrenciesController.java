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
import com.POC1.Week4.RestPOC1.entitys.CountriesCurrencies;
import com.POC1.Week4.RestPOC1.repositories.CountriesCurrenciesRepository;

@RestController
public class CountriesCurrenciesController {
	@Autowired
	private CountriesCurrenciesRepository contRepo;
	
	@PostMapping("/create-countriesCurrencies")
	public CountriesCurrencies createCountryCurrency(@RequestBody CountriesCurrencies contries) {
		return contRepo.save(contries);
	}
	
	@PutMapping("/create-countriesCurrencies")
	public CountriesCurrencies updateCountryCurrency(@RequestBody CountriesCurrencies contries) {
		return contRepo.save(contries);
	}
	
	@DeleteMapping("delete-countriesCurrencies")
	public String deletecountriesCurrencies(@RequestBody CountriesCurrencies con) {
		contRepo.delete(con);
		return " Countries Currencies Deleted";
	}
	
	@GetMapping("/get-All-countriesCurrencies")
	public List<CountriesCurrencies> getcountriesCurrencies(){
		return contRepo.findAll();
	}
}	

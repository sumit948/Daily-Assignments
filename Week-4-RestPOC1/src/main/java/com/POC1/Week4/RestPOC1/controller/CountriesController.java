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
import com.POC1.Week4.RestPOC1.repositories.CountriesRepository;

@RestController
public class CountriesController {
	@Autowired
	private CountriesRepository conRepo;
	
	@PostMapping("/create-country")
	public Countries createCountry(@RequestBody Countries contries) {
		return conRepo.save(contries);
	}
	
	@PutMapping("/create-country")
	public Countries updateCountry(@RequestBody Countries contries) {
		return conRepo.save(contries);
	}
	
	@DeleteMapping("delete-country")
	public String deleteCountry(@RequestBody Countries con) {
		conRepo.delete(con);
		return "Country Deleted";
	}
	
	@GetMapping("/get-allcountry")
	public List<Countries> getCountries(){
		return conRepo.findAll();
	}
	
}

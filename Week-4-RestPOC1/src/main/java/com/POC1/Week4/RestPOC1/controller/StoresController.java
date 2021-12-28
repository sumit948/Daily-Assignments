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
import com.POC1.Week4.RestPOC1.entitys.Stores;
import com.POC1.Week4.RestPOC1.repositories.StoresRepository;

@RestController
public class StoresController {
	@Autowired
	private StoresRepository stRepo;
	
	@PostMapping("/create-Stores")
	public Stores createStore(@RequestBody Stores st) {
		return stRepo.save(st);
	}
	
	@PutMapping("/create-Stores")
	public Stores updateStore(@RequestBody Stores st) {
		return stRepo.save(st);
	}
	
	@DeleteMapping("delete-Stores")
	public String deleteStore(@RequestBody Stores con) {
		stRepo.delete(con);
		return "Store Deleted";
	}
	
	@GetMapping("/get-All-Stores")
	public List<Stores> getStores(){
		return stRepo.findAll();
	}
}

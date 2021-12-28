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
import com.POC1.Week4.RestPOC1.entitys.Regions;
import com.POC1.Week4.RestPOC1.repositories.ProductsRepository;
import com.POC1.Week4.RestPOC1.repositories.RegionsRepository;

@RestController
public class RegionsController {
	@Autowired
	private RegionsRepository regRepo;
	
	@PostMapping("/create-Region")
	public Regions createRegions(@RequestBody Regions regen) {
		return regRepo.save(regen);
	}
	
	@PutMapping("/create-Region")
	public Regions updateRegions(@RequestBody Regions regen) {
		return regRepo.save(regen);
	}
	
	@DeleteMapping("delete-Region")
	public String deleteRegions(@RequestBody Regions con) {
		regRepo.delete(con);
		return "Region Deleted";
	}
	
	@GetMapping("/get-All-Region")
	public List<Regions> getRegions(){
		return regRepo.findAll();
	}
}

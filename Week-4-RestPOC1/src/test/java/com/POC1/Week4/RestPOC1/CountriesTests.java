package com.POC1.Week4.RestPOC1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.POC1.Week4.RestPOC1.controller.CountriesController;
import com.POC1.Week4.RestPOC1.entitys.Countries;
import com.POC1.Week4.RestPOC1.repositories.CountriesRepository;

public class CountriesTests {
	@Autowired
	private CountriesRepository conRepo;
	
	@Autowired
	private CountriesController conCRepo;
	
	@Test
	public void countryTest() {
//		Countries contries = conRepo.save(new Countries());
//		assertEquals(new Countries(), contries);
		Countries c1 = new Countries();
		c1.setCountriesName("Dubai");
		//assertEquals()
	}
}

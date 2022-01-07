package com.example.configclient.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Value("${name}")
	private String name;
	
	@GetMapping("/get-name")
	private String getName() {
		return name+" gettting name";
	}
}

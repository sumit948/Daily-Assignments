package com.example.apiPOC.Week4.apiPOC.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiPOC.Week4.apiPOC.Entity.ApiEntity;
import com.example.apiPOC.Week4.apiPOC.Repository.apiRepository;
import com.example.apiPOC.Week4.apiPOC.Services.ApiService;

@RestController
public class ApiController {
	@Autowired
	private ApiService apiServ;
	
	
	@PostMapping("/create")
	public ApiEntity createApi(@RequestBody ApiEntity apiEn) {
			return apiServ.createApi(apiEn);
	}
	
	@GetMapping("/api/{apiId}")
	public ApiEntity getApi(@PathVariable Long apiId) {
		return apiServ.getApi(apiId);
	}
}

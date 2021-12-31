package com.example.apiPOC.Week4.apiPOC.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.apiPOC.Week4.apiPOC.Entity.ApiEntity;
import com.example.apiPOC.Week4.apiPOC.Repository.apiRepository;

@Service
public class ApiService {
	@Autowired
	private apiRepository apiRepo;

//	public ApiEntity getApi(Long Id) {
//		
//		ApiEntity apiEn = apiRepo.findById(Id).get();
//		return apiEn;
//	}

	public ApiEntity createApi(ApiEntity apiEn) {
		
		return apiRepo.save(apiEn);
	}

	public ApiEntity getApi(Long apiId) {
		// TODO Auto-generated method stub
		ApiEntity apiEnt = apiRepo.findByApiId(apiId);
		return apiEnt;
	}
}

package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Land;
import com.example.demo.repo.LandRepo;

@Service
public class LandService {

	@Autowired
	private LandRepo lRepo;
	
    public List<Land> findAll() {

        return (List<Land>) lRepo.findAll();
    }

}

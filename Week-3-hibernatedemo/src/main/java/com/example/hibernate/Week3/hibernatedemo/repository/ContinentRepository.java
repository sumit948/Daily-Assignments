package com.example.hibernate.Week3.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernate.Week3.hibernatedemo.Entity.Country;

public interface ContinentRepository extends JpaRepository<Country, Long> {
	
}

package com.POC1.Week4.RestPOC1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.POC1.Week4.RestPOC1.entitys.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

}

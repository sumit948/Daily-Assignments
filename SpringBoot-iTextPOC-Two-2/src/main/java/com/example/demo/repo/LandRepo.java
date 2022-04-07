package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Land;

@Repository
public interface LandRepo extends CrudRepository<Land, Long> {

}

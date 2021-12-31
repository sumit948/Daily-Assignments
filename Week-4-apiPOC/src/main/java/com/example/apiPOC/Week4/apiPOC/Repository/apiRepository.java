package com.example.apiPOC.Week4.apiPOC.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiPOC.Week4.apiPOC.Entity.ApiEntity;

@Repository
public interface apiRepository extends JpaRepository<ApiEntity, Long> {

	ApiEntity findByApiId(Long apiId);

}

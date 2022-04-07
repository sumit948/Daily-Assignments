package com.resourceutilizationtool.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resourceutilizationtool.dto.ReportingManagerDTO;
import com.resourceutilizationtool.entity.ReportingManager;

@Component
public class ReportingManagerMapper {

	@Autowired
	private ModelMapper modelMapper;

	public ReportingManagerDTO toDto(ReportingManager reportingManager) {
		return modelMapper.map(reportingManager, ReportingManagerDTO.class);
	}

	public ReportingManager toEntity(ReportingManagerDTO reportingManagerDTO) {
		return modelMapper.map(reportingManagerDTO, ReportingManager.class);
	}
}

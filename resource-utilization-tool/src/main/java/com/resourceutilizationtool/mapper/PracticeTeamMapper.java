package com.resourceutilizationtool.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resourceutilizationtool.dto.PracticeTeamDTO;
import com.resourceutilizationtool.entity.PracticeTeam;

@Component
public class PracticeTeamMapper {

	@Autowired
	private ModelMapper modelMapper;

	public PracticeTeamDTO toDto(PracticeTeam practiceTeam) {
		return modelMapper.map(practiceTeam, PracticeTeamDTO.class);
	}

	public PracticeTeam toEntity(PracticeTeamDTO practiceTeamDTO) {
		return modelMapper.map(practiceTeamDTO, PracticeTeam.class);
	}
}

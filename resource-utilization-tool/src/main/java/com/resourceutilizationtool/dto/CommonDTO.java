package com.resourceutilizationtool.dto;

import java.util.List;

import com.resourceutilizationtool.entity.Employee;

public class CommonDTO {

	private List<Employee> responseList;

	private Employee rmData;

	private StatusDTO statusDTO;

	public List<Employee> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<Employee> responseList) {
		this.responseList = responseList;
	}

	public Employee getRmData() {
		return rmData;
	}

	public void setRmData(Employee rmData) {
		this.rmData = rmData;
	}

	public StatusDTO getStatusDTO() {
		return statusDTO;
	}

	public void setStatusDTO(StatusDTO statusDTO) {
		this.statusDTO = statusDTO;
	}
}

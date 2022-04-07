package com.resourceutilizationtool.Enum;

public enum StatusEnum {
	ALLOCATED("Allocated"),
	BLOCKED("Blocked"),
	BENCH("Bench");

	private String value;

	StatusEnum(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
}

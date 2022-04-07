package com.resourceutilizationtool.dto;

public class StatusDTO {

	private Long allocated;

	private Long bench;

	private Long blocked;

	public Long getAllocated() {
		return allocated;
	}

	public void setAllocated(Long allocated) {
		this.allocated = allocated;
	}

	public Long getBench() {
		return bench;
	}

	public void setBench(Long bench) {
		this.bench = bench;
	}

	public Long getBlocked() {
		return blocked;
	}

	public void setBlocked(Long blocked) {
		this.blocked = blocked;
	}
}

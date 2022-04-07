package com.resourceutilizationtool.customException;

import java.time.LocalDateTime;

public class ExceptionResponse {

	private LocalDateTime timeStamp = LocalDateTime.now();

	private int status;

	private String message;

	private String path;

	public String getMessage() {
		return message;
	}

	public void setMessage(final String errorMessage) {
		this.message = errorMessage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(final String requestedURI) {
		this.path = requestedURI;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp() {
		this.timeStamp = LocalDateTime.now();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [message=" + message + ", path=" + path + ", timeStamp=" + timeStamp + ", status="
			+ status + "]";
	}
}

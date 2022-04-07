package com.resourceutilizationtool.customException;

public class RecordAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecordAlreadyExistException(String message) {
		super(message);
	}
}

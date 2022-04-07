package com.resourceutilizationtool.utils;

public class Constants {
	public enum CustomCodes {
		SUCCESS(500),
		RECORD_NOT_FOUND(501),
		RECORDS_NOT_FOUND(502),
		RECORD_ALREADY_EXISTS(503);
		
		private final int code;
		
		private CustomCodes(int code) {
			this.code  = code;
		}
		
		public int getCode() {
			return code;
		}
	}
}

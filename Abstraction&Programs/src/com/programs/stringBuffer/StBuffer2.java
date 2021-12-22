package com.programs.stringBuffer;

public class StBuffer2 {

	public static void main(String[] args) {
				StringBuffer strBuf1 = new StringBuffer("SRI");
		        StringBuffer strBuf2 = new StringBuffer(100);
		        StringBuffer strBuf3 = new StringBuffer();
		        System.out.println("strBuf1 : " + strBuf1);
		        System.out.println("strBuf2 capacity:"+strBuf2.capacity());
		        System.out.println("strBuf3 capacity:"+strBuf3.capacity());
	}

}

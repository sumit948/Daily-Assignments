package com.programs.stringBuffer;

import java.util.StringTokenizer;

public class StrToken2 {

	public static void main(String[] args) {
		String s1 = new String("aa bb cc dd");
		StringTokenizer st = new StringTokenizer(s1);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}

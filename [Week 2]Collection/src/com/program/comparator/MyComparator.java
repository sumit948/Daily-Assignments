package com.program.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}

	@Override
	public String toString() {
		return "MyComparator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}

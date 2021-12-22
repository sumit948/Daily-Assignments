package com.program.mutithreading3.runnable;

public class OnlyThread implements Runnable {
    String name;
	public void setName(String name) {
		name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println(name);
		}
	}

}

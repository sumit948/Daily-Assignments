package com.program.mutithreading2;

public class Test {

	public static void main(String[] args) {
		ByExtendThread bt = new  ByExtendThread();
		
		bt.setName("MyThread");
		
		System.out.println("getName: "+bt.getName());
		
		System.out.println("MyThread is Alive: "+bt.isAlive());

		System.out.println("MyThread is interrupted: "+bt.isInterrupted());
		
		System.out.println("MyThread is Deamon before: "+bt.isDaemon());
		
		bt.setDaemon(true);
		System.out.println("MyThread is Deamon after: "+bt.isDaemon());
		bt.start(); //start method should placed afer deamon thread set
	}

}

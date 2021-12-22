package com.program.constructorJUnit;

public class SampleConstructor {
//	public String message;
//	   //Constructor
//	   //@param message to be printed
//	   public SampleConstructor(String message){
//	      this.message = message;
//	   }
//	   
//	   public String printMessage(){
//		      System.out.println(message);
//		      return message;​​​​​
//	   }
	private String message;
	public SampleConstructor(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		//System.out.println(message);
		return message;
	}
}

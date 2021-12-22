package com.importantProgram.abstractClass2;

public class point extends Shape {
      static int x,y;
      point(){
    	  x=0;y=0;
      }
      public static void display() {
    	  System.out.println(x+" "+y);  
      }
      
	@Override
	double displayArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}

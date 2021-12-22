package com.program.accessModifiers;

public class AccessModifiers {
	 int x;    //default : whose accessibility is through out the package
     private int y;    //as y is private it can not be seen out side the class
     public int z;    //whose visibility will be through out the program
     protected int p;    //whose visibility is to the derived classes of other packages
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

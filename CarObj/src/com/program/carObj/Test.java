package com.program.carObj;

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
		c.licensePlate = "MH-09 001";
		c.maxSpeed = 65;
		c.speed = 40;
		
		System.out.println(c.licensePlate+"is moving"+c.speed+"and"+c.maxSpeed);

	}

}

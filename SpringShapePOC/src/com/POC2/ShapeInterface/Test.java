package com.POC2.ShapeInterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Shape.xml");
		Rectangle rect = (Rectangle)applicationContext.getBean("rect1"); 
		Circle  circle = (Circle)applicationContext.getBean("circle1");
		System.out.println(rect.Area());
		System.out.println(rect.volume());
		System.out.println(circle.Area());
		System.out.println(circle.volume());
	}

}

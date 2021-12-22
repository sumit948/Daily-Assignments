package com.POC1.Order;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("Order.xml");
		Order order = (Order)appContext.getBean("order1");
		System.out.println(order);

	}

}

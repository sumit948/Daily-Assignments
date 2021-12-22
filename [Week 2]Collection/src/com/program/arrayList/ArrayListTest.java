package com.program.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(null);
		list.add("Jhon");
		list.add(10.55);
		list.add(10);
		list.add(true);
		System.out.println("Full list: "+list);
		list.add("weak");
		System.out.println("After add into list: "+list);
		list.remove(4);
		
		System.out.println("After delete 4: "+list+" Size is: "+list.size());
		list.set(3, 20);
		System.out.println();
		System.out.println("After replaceing 10 to 20: "+list);
		
		
	}

}

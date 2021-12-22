package com.program.treeset2;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// Create a TreeSet and store some values in it.
		SortedSet<String> mySet = new TreeSet<String>();
		mySet.add("Pear");
		mySet.add("Apple");
		mySet.add("Strawberry");
		mySet.add("Banana");
		
		// Display the elements in the TreeSet.
		System.out.println("Here are the TreeSet elements " +
		"in ascending order:");
		
		for (String str : mySet)
		System.out.println(str);
		
		// Add a new element to the TreeSet.
		System.out.println("\nAdding Blueberry to the set.");
		mySet.add("Blueberry");
		
		// Display the elements again.
		System.out.println("\nHere are the TreeSet elements " +
		"again:");
		for (String str : mySet)
		System.out.println(str);


	}

}

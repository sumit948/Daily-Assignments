package com.program.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		String [ ] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList
		for (int k = 0; k < names.length; k++)
		nameList.add(names[k]);
		// Display name list using an iterator
		ListIterator<String> it = (ListIterator<String>) nameList.iterator(); // Get the iterator
		while (it.hasNext())
		// Use the iterator
		System.out.println(it.next());
		System.out.println("Check with privious");
		while (it.hasPrevious())
			// Use the iterator
			System.out.println(it.previous());

	}

}

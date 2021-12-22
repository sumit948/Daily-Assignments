package com.program.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		String [ ] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList using a ListIterator
		ListIterator<String> it = nameList.listIterator();
		for (int k = 0; k < names.length; k++)
		it.add(names[k]);
		// Get a new ListIterator for printing
		it = nameList.listIterator();
		while (it.hasNext())
		System.out.println(it.next());
		
		//new HashSet<E>(); control + enter
 
	}

}

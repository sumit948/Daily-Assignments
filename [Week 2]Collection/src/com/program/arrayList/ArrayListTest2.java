package com.program.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String> ();
		String [ ] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList
		for (int k = 0; k < names.length; k++)  //here we are adding string array into ArrayList best for retrival operations
		nameList.add(names[k]);
		// Display name list
		for (int k = 0; k < nameList.size(); k++)
		System.out.println(nameList.get(k));

	}

}

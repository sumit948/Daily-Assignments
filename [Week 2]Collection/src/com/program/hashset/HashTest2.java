package com.program.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashTest2 {

	public static void main(String[] args) {
		Set<String> h1 = new HashSet<String>();  //insertion order not preserved
		h1.add("Jhon");
		h1.add("Weak");
		h1.add("Baba");
		h1.add("Yaga");
		
		Iterator i1 = h1.iterator();
		
		while(i1.hasNext()) {
			i1.next();
		}
		System.out.println(h1);
		
		if(h1.contains("Weak")) {
			System.out.println("Finding for weak........\n.......\n.....\n...");
			System.out.println("Yes Weak present there");
		}
		else {
			System.out.println("No Weak present there");
		}

	}

}

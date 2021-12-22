package com.program.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashCodeTest {
public HashCodeTest(String v, String d) {
	vin = v; description = d;	}

String vin, description;
//	public boolean equals(Object other)
//	// Depends on vin only
//	{
//	if (!(other instanceof HashCodeTest))
//	return false;
//	else
//	return vin.equalsIgnoreCase(((HashCodeTest)other).vin);
//	}
//	public int hashCode() { return vin.hashCode();} // Depends on vin only
//	public HashCodeTest(String v, String d) { vin = v; description = d; }
//	public String toString() { return vin + " " + description; }
	
	public static void main(String[] args) {
//		HashCodeTest h1 = new HashCodeTest("one", "two");
//		System.out.println(h1.equals(true));
//		System.out.println(h1.hashCode());
		Set<HashCodeTest> carSet = new HashSet<HashCodeTest>();
		HashCodeTest [ ] myRides = {
		new HashCodeTest("TJ1", "Toyota"),
		new HashCodeTest("GM1", "Corvette"),
		new HashCodeTest("TJ1", "Toyota Corolla")
		};
		// Add the cars to the HashSet
		for (HashCodeTest c : myRides)
		carSet.add(c);
		// Print the list using an Iterator
		Iterator it = carSet.iterator();
		while (it.hasNext())
		System.out.println(it.next());
		System.out.println(carSet);
		
	}

}

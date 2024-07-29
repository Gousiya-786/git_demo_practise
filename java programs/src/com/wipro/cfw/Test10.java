package com.wipro.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test10 {
	
	public static void main(String[] args)
	{
		TreeSet<Integer> ts = new TreeSet();
		ts.add(28);
		ts.add(43);
		ts.add(55);
		ts.add(70);
		
		SortedSet<Integer> ss = ts.headSet(55);
		System.out.println(ss);
		
		SortedSet<Integer> ss1 = ts.tailSet(55);
		System.out.println(ss1);
		
		SortedSet<Integer> ss2 = ts.subSet(28, 70);
		System.out.println(ss2);
		
	}

}

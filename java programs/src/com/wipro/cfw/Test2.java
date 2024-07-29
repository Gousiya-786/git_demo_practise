package com.wipro.cfw;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	
	public static void main(String[] args)
	{
		Set s = new HashSet();
		Set s1 = new LinkedHashSet();
		
		s.add(44);
		s.add("Reshu");
		s.add('R');
		s.add(null);
		s.add(true);
		
		System.out.println(s);
		
		
		s1.add(44);
		s1.add("Reshu");
		s1.add('R');
		s1.add(null);
		s1.add(true);
		
		
		for (Object o :s1)
		{
			System.out.println(o);
		}
	}

}

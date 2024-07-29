package com.wipro.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test6 {
	
	public static void main(String[] args)
	{
				
		Map<Character , String> m = new HashMap();
		
		m.put('A', "Rekha");
		m.put('B', "Sushma");
		m.put('C', "Priya");
		m.put('D', "Kumar");
		
		System.out.println(m);
		
		for(Map.Entry<Character, String> me:m.entrySet())
		{
			System.out.println(me);
		}
	}

}



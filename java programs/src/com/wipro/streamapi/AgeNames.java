package com.wipro.streamapi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgeNames {

	public static void main(String[] args)
	{
		Map<String,Integer> m = new LinkedHashMap<>();
		
		m.put("Haritha", 34);
		m.put("Suma", 29);
		m.put("Anusha", 26);
		m.put("Kumari", 38);
		
		System.out.println(m);
		
		List<Integer> doublevalues = m.values().stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(doublevalues);
		
		List<String> NamesUppercase = m.keySet().stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(NamesUppercase);
		for(String o:NamesUppercase)
		{
			System.out.println(o);
		}
		
	}
}

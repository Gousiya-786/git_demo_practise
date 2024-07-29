package com.wipro.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutSreamapi {

	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("rahul","aparna","sneha","ram","bhavya");
		
		List<String> filteredNames = new ArrayList<>();
		
		for(String name : names)
		{
			if(name.startsWith("r"))
			{
				filteredNames.add(name);
			}
		}
		
		for(String fn : filteredNames)
		{
			System.out.println(fn);
		}
	}
}

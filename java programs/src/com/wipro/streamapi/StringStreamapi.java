package com.wipro.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStreamapi {
	
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("rahul","aparna","sneha","ram","bhavya");
		System.out.println(names);
		
		List<String> filteredNames = names.stream().filter(x->x.startsWith("r")).collect(Collectors.toList());
		System.out.println(filteredNames);
		
		List<String> UppercaseNames = names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(UppercaseNames);
		
		List<String> sortednames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortednames);
		
		List<String> sortednamesDescending = names.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
		System.out.println(sortednamesDescending);
		
		names.stream().sorted((x,y)->y.compareTo(x)).forEach(x-> System.out.println(x));
		
		
	}

}

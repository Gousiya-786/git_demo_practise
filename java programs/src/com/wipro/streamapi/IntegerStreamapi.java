package com.wipro.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntegerStreamapi {

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(3,6,9,8,10,4,7,4,9,8);
		System.out.println(numbers);
		
		Optional<Integer> min = numbers.stream().min((x,y)->x.compareTo(y));
		min.ifPresent(value -> System.out.println("The minimum value :"+value));
		
		numbers.stream().max(Comparator.naturalOrder()).ifPresent(x->System.out.println("The Maximum Value :"+x));
		
		numbers.stream().reduce((x,y)-> x+y ).ifPresent(x->System.out.println("The total sum :"+x));
		
		System.out.println("The Sum of Numbers :"+numbers.stream().reduce(0, (x,y)-> x+y));
		
		
		List<Integer> DistinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(DistinctNumbers);
	}
}

package com.wipro.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {

	public static List<Customer> getAll()
	{
		return Stream.of(
				
				new Customer(111,"Anandh","anandh@gmail.com",Arrays.asList("1234567890","9876543210")),
				new Customer(112,"Basha","basha@gmail.com",Arrays.asList("8476529016","8925346710")),
				new Customer(113,"Ayush","ayush7@gmail.com",Arrays.asList("1653429870","7854312964")),
				new Customer(114,"Meghana","meghana9@gmail.com",Arrays.asList("6241073452","7245157379"))).collect(Collectors.toList());
	}
	
	
}

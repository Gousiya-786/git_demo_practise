package com.wipro.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args)
	{
		List<Customer> customers = DataBase.getAll();
		
		List<String> emails = customers.stream().map(x->x.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		List<List<String>> phoneNumbers = customers.stream().map(x->x.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		List<String> phNumbers = customers.stream().flatMap(x->x.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phNumbers);
	}

}

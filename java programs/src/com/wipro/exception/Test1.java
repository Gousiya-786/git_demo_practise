package com.wipro.exception;
import java.util.Scanner;
public class Test1 {
	
	public static void main(String[] args)
	{
	  
		Scanner s = new Scanner(System.in);
		System.out.println("enter name:");
		String name = s.nextLine();
		if(name.startsWith("y"))
		{
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Name should not starts with y");
			}
		}
		else
		{
			System.out.println("Welcome to "+name);
		}
	}

}

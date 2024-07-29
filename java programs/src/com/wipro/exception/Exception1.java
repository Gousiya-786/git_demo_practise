package com.wipro.exception;

public class Exception1 {

	public static void main(String[] args)
	{
		int x=200,y=0;
		try 
		{
		int z=x/y;
		System.out.println("Division is :"+z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Don't enter zero as denominator");
		}
		System.out.println("rest statements executed");
	}
}

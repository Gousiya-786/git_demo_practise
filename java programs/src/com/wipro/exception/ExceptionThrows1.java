package com.wipro.exception;

public class ExceptionThrows1 {
	
	public static void main(String[] args)
	{
		ExceptionThrows obj = new ExceptionThrows();
		try {
			obj.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Zero can not be in denominator,check it once");
		}
	}

}

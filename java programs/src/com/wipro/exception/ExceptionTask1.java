package com.wipro.exception;

public class ExceptionTask1 {

	public void divideNumbers(int a, int b)
	{
		try {
		int div = a/b;
		System.out.println("Division is :"+div);
		}
		catch(ArithmeticException ae)
		{
		   System.out.println("Do not enter zero as denominator");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Enter valid input");
		}
			
	}
	public static void main(String[] args)
	{
		ExceptionTask1 et = new ExceptionTask1();
		et.divideNumbers(12, 0);
		
	}
		
}

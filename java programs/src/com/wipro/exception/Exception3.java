package com.wipro.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 
{
	
	
	public static void main(String[] args)
	{
		try
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no. :");
		int fno = s.nextInt();
		System.out.println("Enter second no. :");
		int sno = s.nextInt();
		int div = fno/sno;
		System.out.println("Division :"+div);
		}
		catch(RuntimeException re)
		{
			if(re instanceof ArithmeticException)
			{
				System.out.println("Do not enter Zero as input");
			}
	        else if(re instanceof InputMismatchException)
			{
				System.out.println("Enter numeric values only");
			}
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
}

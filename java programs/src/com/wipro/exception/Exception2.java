package com.wipro.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {
	
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
		catch(ArithmeticException ae)
		{
			System.out.println("Don't enter zero as denominator");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only numeric values");
		}
		System.out.println("rest statements executed");
	}

}

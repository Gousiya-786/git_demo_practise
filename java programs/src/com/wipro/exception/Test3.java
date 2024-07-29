package com.wipro.exception;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the product weight :");
		int weight = s.nextInt();
		Test2 ob  = new Test2();
		ob.checkProduct(weight);
	}
}

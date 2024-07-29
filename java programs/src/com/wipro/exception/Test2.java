package com.wipro.exception;

public class Test2 {
	
	public void checkProduct(int weight)
	{
		if(weight>100)
		{
			System.out.println("Product is valid");
		}
		else
		{
			try
			{
				throw new InvalidProductException();
			}
			catch(InvalidProductException ie)
			{
				System.out.println("Check product weight, it was be greater than 100kgs");
			}
		}
	}


}

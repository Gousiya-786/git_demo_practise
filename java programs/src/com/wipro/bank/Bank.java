package com.wipro.bank;

public class Bank  {

	public static void main(String[] args)
	{
		BankAccount bc = new BankAccount(1000.0);
		try
		{
			bc.withdraw(1250.0);
		}
		catch(InsufficientFundsException ie)
		{
			System.out.println("InsufficientFundsException :"+ie.getMessage());
		}
		
    }
	
}

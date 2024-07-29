 package com.wipro.bank;

public class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}

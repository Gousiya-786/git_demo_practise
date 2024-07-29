package com.wipro.bank;

public class BankAccount {

	private double balance;
	
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException 
	{
		if(amount>balance) 
		{
			throw new InsufficientFundsException("Insufficient Funds : Unable to withdraw "+amount+" \nCurrent balance is "+balance);
		}
		else
		{
			balance = balance - amount;
			System.out.println("Withdrawal of " +amount + " Successful.\nReamaining balance is "+balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

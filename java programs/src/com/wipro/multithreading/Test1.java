package com.wipro.multithreading;

public class Test1 extends Thread{

	@Override
	public void run()
	{
		for(int i =1;i<=10;i++)
		{
		System.out.println(Thread.currentThread().getName()+ "-->" +i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args)
	{
		
		Test1 ob = new Test1();
		ob.setName("Reshma");
		
		Test1 ob1 = new Test1();
		ob1.setName("Gousiya");
		
		ob.start();
		ob1.start();
	}
	
}

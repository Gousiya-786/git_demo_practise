package com.wipro.multithreading;

public class RunnableWithLamda {
	
	public static void main(String[] args)
	{
		Runnable obj = () -> {
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName() + "-->" +i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(obj);
		t.setName("Wipro");
		t.start();
		
		Thread t1 = new Thread(obj);
		t1.setName("Sana");
		t1.start();
	}

}

package com.wipro.multithreading;

public class RunnableWithoutLamda implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args)
	{
		Runnable obj = new RunnableWithoutLamda();
		
		Thread t = new Thread(obj);
		t.setName("Raheema");
		t.start();
		
		Thread t1 = new Thread(obj);
		t1.setName("Rahul");
		t1.start();
		
	}
}

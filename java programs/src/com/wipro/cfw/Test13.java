package com.wipro.cfw;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test13 {
	
	public static void main(String[] args)
	{
        ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=81;i<=90;i++)
		{
			al.add(i);
		}
		
		ListIterator<Integer> it = al.listIterator();
		System.out.println("Elements in Forward Direction");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Elements in Backward Direction");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}

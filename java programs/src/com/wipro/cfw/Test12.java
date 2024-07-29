package com.wipro.cfw;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=81;i<=90;i++)
		{
			al.add(i);
		}
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			int x=it.next();
			if(x%2==0)
			{
				it.remove();
			}
		}
		System.out.println(al);
	}

}

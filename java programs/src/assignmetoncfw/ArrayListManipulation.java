package assignmetoncfw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;


public class ArrayListManipulation {
	
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList();
		al.add(23);
		al.add(55);
		al.add(67);
		al.add(22);
		al.add(90);
		al.add(88);
		al.add(42);
		al.add(55);
		al.add(67);
		al.add(120);
		
		System.out.println(al);
		
		int max = al.get(0);
		for (int n : al)
		{
			if(n>max)
			{
				max = n;
			}
		}
		System.out.println("Maximum value: " +max);
		int min = al.get(0);
		for (int n : al)
		{
			if(n<min)
			{
				min = n;
			}
		}
		System.out.println("Minimum value: " +min);
		
		Collections.sort(al);
		System.out.println("List in Ascending order :"+al);
		
		Collections.reverse(al);
		System.out.println("List in Descending order :"+al);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(al);
		al.clear();
		for(Integer o : lhs)
		{
			al.add(o);
		}
		Collections.sort(al);
		System.out.println(al);
		
	}

}

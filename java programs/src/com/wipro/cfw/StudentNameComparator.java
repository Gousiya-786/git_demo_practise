package com.wipro.cfw;

import java.util.Comparator;

public class StudentNameComparator  implements Comparator 
{

	public int compare(Object o1 , Object o2)
	{
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		return -st1.getStname().compareTo(st2.getStname());
	}
}

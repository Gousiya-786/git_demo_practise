package com.wipro.cfw;

import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(new StudentGradeComparator());
		
		Student st1 = new Student('A' , "Reshma");
		Student st2 = new Student('B' ,"Roshini");
		Student st3 = new Student('C' , "Jareena");
		
		ts.add(st1);
		ts.add(st3);
		ts.add(st2);
		
		for(Object o : ts)
		{
			System.out.println(o);
		}
	}
}

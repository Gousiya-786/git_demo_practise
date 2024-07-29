package com.wipro.Generics;

import java.util.TreeSet;

import com.wipro.cfw.Student;

public class Test1 {
	
	public static void main(String[] args)
	{
		TreeSet<Student> ts = new TreeSet(new StudentNameComparator());
		
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

package com.wipro.Generics;

import java.util.Comparator;

import com.wipro.cfw.Student;

public class StudentNameComparator implements Comparator<Student> 
{
	public int compare(Student o1, Student o2)
	{
		return o2.getStname().compareTo(o1.getStname());
	}

}

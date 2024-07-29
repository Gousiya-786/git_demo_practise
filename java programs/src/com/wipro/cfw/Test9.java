package com.wipro.cfw;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test9 {

public static void main(String[] args) {
		
		
		SortedMap<Student,Integer> sm = new TreeMap(new StudentGradeComparator());
		
		sm.put(new Student('A',"rk"), 154);
		sm.put(new Student('C',"smith"),44);
		sm.put(new Student('B',"john"), 24);
		
		System.out.println(sm);
		
	}
}

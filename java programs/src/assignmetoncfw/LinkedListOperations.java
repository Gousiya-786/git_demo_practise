package assignmetoncfw;

import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args)
	{
		LinkedList<Student> ll = new LinkedList();
		
		Student st1 = new Student(123,"Ruman",8.7);
		Student st2 = new Student(156,"Arun",7.6);
		Student st3 = new Student(342,"Rushali",6.9);
		Student st4 = new Student(543,"Arjun",9.2);
		
		ll.add(st1);
		ll.add(st2);
		ll.add(st3);
		ll.add(st4);
		
		System.out.println(ll);
		
		ll.add(new Student(435,"Rohan",9.7));
		System.out.println(ll);
		
		
		
	}
}

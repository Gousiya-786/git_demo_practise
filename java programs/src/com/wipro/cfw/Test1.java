package com.wipro.cfw;
import java.util.List;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		
	   List l = new LinkedList();
	   
	   l.add(23);
	   l.add("Reshma");
	   l.add(true);
	   l.add('a');
	   l.add(null);
	   l.add(23);
	   
	   System.out.println(l);
	   System.out.println(l.get(3));
	   l.remove(3);
	   System.out.println(l);
	   System.out.println(l.indexOf(null));
	   l.clear();
	   System.out.println(l.isEmpty());
	   
	  
	}

}

package com.wipro.cfw;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
	
public static void main(String[] args) {
		
		
		//create an object for Map interface
		
		Map<Integer,Student> m = new HashMap();
		
		
		m.put(65, new Student('A',"john"));
		m.put(26, new Student('B',"ram"));
		m.put(23, new Student('E',"williams"));
		m.put(90, new Student('O',"smith"));
		
		
		
		for(Map.Entry<Integer,Student> me: m.entrySet())
		{
			System.out.println(me.getKey() + "==> " + me.getValue().getStname() + "==> " + me.getValue().getSt());
			
		}
		
	}


}

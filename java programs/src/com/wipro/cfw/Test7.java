package com.wipro.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test7 {
	
	public static void main(String[] args)
	{
 
	  Map m1 = new HashMap();
	  
	  m1.put(100, 'R');
	  m1.put("Rekha", null);
	  m1.put("Lakshman", 112);
	  System.out.println(m1.size());
	  System.out.println(m1.isEmpty());
	  System.out.println(m1.containsKey(100));
	  System.out.println(m1.get("Lakshman"));
	  System.out.println(m1);
	  
	  for(Object me:m1.entrySet())
	  {
			
			Map.Entry entry = (Map.Entry)me;
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println("Key:" + key + ", Value:" + value );
			
		}
	
	
	}
}

package assignmetoncfw;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Grapes");
		hs.add("Orange");
		hs.add("Ramesh");
		hs.add("Apple");
		hs.add("Banana");
		
		System.out.println(hs);
		
				
	
		System.out.println(hs.contains("Apple"));
		
		
	}

}

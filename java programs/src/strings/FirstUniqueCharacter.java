package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {

	public static char firstUniqueChar(String s)
	{
		Map<Character, Integer> m = new HashMap<>();
		
		for(char c : s.toCharArray())
		{
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		for(char c : s.toCharArray())
		{
			if(m.get(c) == 1)
			{
				return c;
			}
		}
		
		return '\0';
		
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String st = s.next();
		char y = firstUniqueChar(st);
		System.out.println("First Unique Character of a string : "+y);
	}
}

package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
	
	public static boolean areAnagrams(String st1 , String st2) 
	{

		if(st1.length() != st2.length())
		{
			return false;
		
		}
		
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1 , ch2);
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String1 :");
		String st1 = s.next();
		System.out.println("Enter the String2 :");
		String st2 = s.next();
		
		if(areAnagrams(st1 , st2))
		{
			System.out.println(st1 + " and " +st2+ " are anagrams");
		}
		else
		{
			System.out.println(st1 + " and " +st2+ " are not anagrams");
		}
	}

}

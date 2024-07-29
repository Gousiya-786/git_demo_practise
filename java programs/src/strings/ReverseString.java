package strings;

import java.util.Scanner;

public class ReverseString
{
	
	public static String reverseString(String s) 
	{
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            // Swap characters at start and end indices
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            
            // Move towards the center
            start++;
            end--;
        }
        return new String(ch);
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String x = s.next();
		String y = reverseString(x);
        System.out.println(y);
		
	}
}
        



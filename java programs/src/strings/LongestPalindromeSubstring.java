package strings;
import java.util.Scanner;
public class LongestPalindromeSubstring {
	
	public static String longestpalindrome(String s)
	{
		if(s == null || s.length() < 1){
			return "";
		}
        
		int start = 0,end = 0;
		
		for(int i = 0; i<s.length();i++)
		{
			int len1 = expandAroundCenter(s,i,i);
			int len2 = expandAroundCenter(s,i,i+1);
			
			int maxLength = Math.max(len1, len2);
			
			if (maxLength > end - start)
			{
				start = i-(maxLength-1)/2;
				end = i + maxLength/2;
			}
		}
		return s.substring(start,end+1);
	}
	private static int expandAroundCenter(String s, int left, int right) {
		 while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
	        {
	            left--;
	            right++;
	        }
		return right-left-1;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string :");
		String st = s.next();
		String y = longestpalindrome(st);
		System.out.println("Longest Palindrome Substring : "+y);
	}
}

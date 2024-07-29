import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class UniqueNumberChecker {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();
	        
	        boolean isUnique = checkUnique(number);
	        
	        if (isUnique) {
	            System.out.println(number + " is a unique number.");
	        } else {
	            System.out.println(number + " is not a unique number.");
	        }
	        
	        scanner.close();
	    }
	    
	    public static boolean checkUnique(int number) {
	        String numStr = String.valueOf(number);
	        Set<Character> digitSet = new HashSet<>();
	        
	        for (int i = 0; i < numStr.length(); i++) {
	            char digit = numStr.charAt(i);
	            if (digitSet.contains(digit)) {
	                return false; 
	            }
	            digitSet.add(digit);
	        }
	        
	        return true; 
	    }

}

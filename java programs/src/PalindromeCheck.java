public class PalindromeCheck {

    public static void main(String[] args) {
        checkPalindrome(2468642);
        checkPalindrome(12345);
        checkPalindrome(1234567);
    }

    public static void checkPalindrome(long number) {
        String numStr = String.valueOf(number);
        boolean isPalindrome = true;

        // Check palindrome
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(number + " is palindrome");

            // Calculate sum of even digits
            int evenSum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                if (digit % 2 == 0) {
                    evenSum += digit;
                }
            }

            // Check sum condition
            if (evenSum > 25) {
                System.out.println("Sum of even numbers (" + evenSum + ") is greater than 25");
            } else {
                System.out.println("Sum of even numbers (" + evenSum + ") is less than or equal to 25");
            }
        } else {
            System.out.println(number + " is not palindrome");
        }
    }
}
	
                

	     
   

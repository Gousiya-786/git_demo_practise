package strings;
import java.util.Scanner;

public class StringCompression {

	public static String compressString(String s) {
        if (s == null || s.length() == 0) {
            return s; // return empty string if input is null or empty
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar);
        compressed.append(count);

        String compressedString = compressed.toString();

        return compressedString.length() < s.length() ? compressedString : s;
    }

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        String x = s.next();
        String y = compressString(x);
        System.out.println("Original: " + x);
        System.out.println("Compressed: " + y); 
    }
}

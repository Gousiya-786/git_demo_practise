import java.util.Scanner;
class SumIntegers 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers separated by spaces:");
        while (scanner.hasNext()) 
        {
            if (scanner.hasNextInt()) 
            {
                int num = scanner.nextInt();
                sum += num;
                int finalsum = sum;
             }             
             else 
             {
                // If the input is not an integer, display an error message
                String invalidInput = scanner.next();
                System.out.println("Error: \"" + invalidInput + "\" is not an integer.");
             }
        }

        System.out.println("Sum of the integers: " + finalsum);


        scanner.close();
    }
}
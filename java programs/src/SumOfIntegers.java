import java.util.Scanner;
public class SumOfIntegers 
{

	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        int sum = 0;
        
        System.out.print("Enter integers separated by spaces: ");
        
        while (s.hasNext()) 
        {
            if (s.hasNextInt())
            {
                int num = s.nextInt();
                sum = sum+ num; 
            } 
            else 
            { 
            	String InvalidInput = s.nextLine();
                System.out.println("Error: Non-integer value detected");
                s.next(); 
            }
            System.out.println("The sum of Integers :"+sum);
        }
         
        s.close();
    }
	
}

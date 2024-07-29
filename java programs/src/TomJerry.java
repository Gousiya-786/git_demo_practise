import java.util.Scanner;
public class TomJerry {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = s.nextInt();
	
		if(n>=20 && n<=30)
		{
			if(n%2==0)
			{
				System.out.println("Jerry");
			}
			else
			{
				System.out.println("Tom");
			}
		}
		else
		{
			System.out.println("Invalid Number");
		}	
	}
}

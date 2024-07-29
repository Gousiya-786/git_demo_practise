
public class BankAccount {

	long accountNumber = 32145677842896l ;
	   double balance = 5445.65;

	   public void display()
	  {
	    System.out.println("The Account number is :"+accountNumber);
	    System.out.println("The Account balance is :"+balance);

	  }
	   public void deposit()
	   {
	      double depositamount = 12345.76;
	      System.out.println("The Current balnce after deposit is :"+(balance+depositamount));

	   }

	   public void withdraw()
	   {
	      double withdrawalamount = 3456.66 ; 
	      System.out.println("The Current balance after withdraw is :"+(balance-withdrawalamount));

	   }

	   public static void main(String[] args)
	   {
	     BankAccount ob = new BankAccount();
	     ob.display();
	     ob.deposit();
	     ob.withdraw();
	    }


}


public class Car {
 
	String make = "MarutiSuzuki";
	  String model = "Fronx";
	  int year = 2023;

	 public void displayInfo()
	 {
	  System.out.println("The car make = "+make);
	  System.out.println("The car model = "+model);
	  System.out.println("The car launched year = "+year);

	 }

	 public static void main(String[] args)
	 {
	  Car ob = new Car();
	  ob.displayInfo();

	 }

}

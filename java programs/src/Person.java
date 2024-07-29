
public class Person {

	String name = "Ayushman";
	 int age = 29;

	  public void display()
	 {
	   System.out.println("The name of person is : "+name);
	   System.out.println("The age of person is : "+age);

	 }

	  public void greet()
	  {
	   System.out.println("Good Morning "+name);

	  }
	   
	  public static void main(String[] args)
	  {

	   Person obj = new Person();
	   obj.display();
	   obj.greet();
	  }
	
}

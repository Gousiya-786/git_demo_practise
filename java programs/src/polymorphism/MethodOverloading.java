package polymorphism;

public class MethodOverloading {

	public void operation(int a, int b)
	{
		System.out.println("Int Sum is :"+(a+b));
		
	}
	
	public void operation(double a, double b)
	{
		System.out.println("Double Sum is :"+(a+b));
	}
	
	public void operation(String Firstname,String Lastname)
	{
		System.out.println("The Fullname is :"+(Firstname+Lastname));
	}
	
	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.operation(5, 9);
		MO.operation(3.5, 7.5);
		MO.operation("Sandhya", "Rani");

	}

}

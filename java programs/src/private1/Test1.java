package private1;

public class Test1 {

	private void div(int x, int y)
	{
		System.out.println("The division is :"+(x/y));
	}
	
	public static void main(String[] args)
	{
		Test1 ob = new Test1();
		ob.div(12, 6);
	}
}

package Abstraction;

public class TestB extends TestA 
{
	@Override
	public void sum(int x,int y)
	{
		System.out.println("The sum is :"+(x+y));
	}

	public static void main(String[] args) {
		TestA ob = new TestB();
		ob.sum(23, 13);
		
	}

}

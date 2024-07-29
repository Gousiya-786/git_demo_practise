package Abstraction;

public class TestC extends TestA{
    @Override  
	public void sum(int x,int y)
	{
		System.out.println("The Subtraction is :"+(x-y));
	}
	public static void main(String[] args)
	{
		TestA ob = new TestC();
		ob.sum(8,7);

	}

}

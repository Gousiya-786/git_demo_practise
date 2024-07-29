class Parameterized
{
  int a,b;
 
  public Parameterized(int x, int y)
  {
     a = x;
     b = y;

  }
   
   public void mul()
   {
      System.out.println("product is : "+(a*b));

   }
   
   public static void main(String[] args)
   {

    Parameterized obj = new Parameterized(3,8);
    
    obj.mul();


   }

}
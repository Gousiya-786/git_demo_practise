
public class Rectangle {

	int length = 16;
	   int width = 9;
	   int area = length*width;
	   int perimeter = 2*(length+width);
	   public void calculateArea()
	   {

	     System.out.println("The Area of Rectangle is : "+area);

	   }

	   public void calculatePerimeter()
	   {

	     System.out.println("The Perimeter of Rectangle is : "+perimeter);

	   }
	  
	   public static void main(String[] args)
	   {
	   
	     Rectangle A = new Rectangle();
	     A.calculateArea();
	     A.calculatePerimeter();

	   }

}

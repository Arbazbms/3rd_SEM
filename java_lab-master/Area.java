import java.lang.*;
import java.util.*;
abstract class Shape
{
	int l,b;
	abstract void printArea();
}

class Rectangle extends Shape
{	
	
	double area;
	void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length: ");
		l = sc.nextInt();
		System.out.println("Enter the breadth: ");
		b = sc.nextInt();
		System.out.println("area of rectangle is  :  " + (float) (l * b));

	
		
	}
}





class Circle extends Shape
{	
	
	double area;
	void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		l = sc.nextInt();
		System.out.println("area of Circle is  :  " + (float) ((3.14159) * l * l));

	
		
	}
}



class Triangle extends Shape
{	
	
	double area;
	void printArea()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		b = sc.nextInt();
		System.out.println("Enter the height: ");
		l = sc.nextInt();
		System.out.println("area of Triangle is  :  " +  (float) (0.5 * l * b));		
	}

}





class Area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choise : 1-Rectangle  2-Circle   3-traingle");
		int ch = sc.nextInt();
		if(ch == 1)
		{	
			Rectangle r = new Rectangle();
			r.printArea();
			
		}
		else if(ch == 2)
		{

			Circle c = new Circle();
			c.printArea();
			
		}else{

			Triangle t = new Triangle();
			t.printArea();
			
		}
	}
}



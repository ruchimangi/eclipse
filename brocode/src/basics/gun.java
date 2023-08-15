package basics;
import java.util.Scanner;

public class gun {
	public static void main(String[] args)
	{
		//hypotenuse of a triangle
		
		double x;
		double y;
		double z;
		
		Scanner triangle = new Scanner(System.in);
		
		System.out.println("enter side x:");
		x = triangle.nextDouble();
		
		System.out.println("enter side y:");
		y = triangle.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		
		System.out.println("hypotenuse of a triangle is:" +z);
		
		
		
		
	}

}

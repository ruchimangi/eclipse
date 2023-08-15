package basics;

public class valcano {   //overloaded methods = methods that have same name but different parameters are called overloaded methods.
	public static void main(String[] args)  // method name + parameter = method signature
	
	{
		double x = add(10.0,20.0,30.0);
		System.out.println(x);
		
	}
	
	static double add(double a, double b) {
	System.out.println("this is overloaded method 1");
	return a+b;
	}
	
	static double add(double a, double b,double c) {
		System.out.println("this is overloaded method 2");
		return a+b+c;
	}
	

}

package basics;

public class carrot {
	public static void main(String[] args)
	{
		
	String x = "Water";
	String y = "coffee";
	
	x=y;
	
	System.out.println("x: "+x);
	System.out.println("y: "+y);
	
	
	String m = "white";
	String n = "blue";
	
	n=m; // looking that reverse also working same
	
	System.out.println("m: "+m);
	System.out.println("n: "+n);
	
	
	String g = "soda";
	String k = "wine";
	String temp;
	
	temp = g;
	g = k;
	k = temp;
	
	System.out.println("g: "+g);
	System.out.println("k: "+k);
	
	

	}
}

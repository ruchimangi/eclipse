import java.util.*;
import java.lang.*;
import java.io.*
class minmaxnorm{

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the min value:");
	double min=sc.nextDouble();
	System.out.println("enter the max value:");
	double max=sc.nextDouble();
	System.out.println("enter the new min value:");
	double nmin=sc.nextDouble();
	System.out.println("enter the new max value:");
	double nmax=sc.nextDouble();
	System.out.println("enter the required value:");
	double r=sc.nextDouble();
	double v=((r-min)*(nmax-nmin)/(maxx-min))+nmin;
	System.out.println("normalized value is:"+v);


	}

}

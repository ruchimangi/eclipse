import java.util.*;
import java.lang.*;
import java.io.*
public class minmax
{
public static void main(String[] args)
{
	scaneer sc=new scanner(system.in);
	System.out.println("enter the min value:");
	double min=sc.nextdouble();
	System.out.println("enter the max value:");
	double max=sc.nextdouble();
	System.out.println("enter the new min value:");
	double nmin=sc.nextdouble();
	System.out.println("enter the new max value:");
	double nmax=sc.nextdouble();
	System.out.println("enter the required value:");
	double r=sc.nextdouble();
	doublev=((r-min)*(nmax-nmin)/(maxx-min))+nmin;
	System.out.println("normalized value is:"+v);


	}

}

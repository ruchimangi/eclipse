package cadbury;

public static void main(String[] args) {
	
	new roots();

public class roots
{
	
	double root1=0;
	double root2=0;
	double root =0;
	roots(int a,int b, int c)
	{
		
		double val = ((b*b)-4*a*c);
		double disc = Math.sqrt(val);
		
	 if(disc>0) {
		 root1=((-b+disc)/2*a);
		 root2=((-b-disc)/2*a);
		 
		 System.out.println("the roots are real and distinctive ");
		 System.out.println("they are: " + root1 + "and" +root2);
	 } 
	 else if(disc==0) {
		 root=((-b+disc)/2*a);
		 System.out.println("the roots are real and equal ");
		 System.out.println("the rrot is :" + root);
			 
		 }
	 else {
		 System.out.println("roots are imaginary");
	 }
		
		
	}

}


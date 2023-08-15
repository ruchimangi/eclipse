package cadbury;
import java.util.Scanner;

public class bikes
{
	Scanner scan = new Scanner(System.in);
	 double driver1;
	 double driver2;
	 double driver3;
	 double driver4;
	 double driver5;
		bikes(){
		System.out.println("enter speed of driver1 :");	
		driver1 =scan.nextDouble();
		System.out.println("enter speed of driver2 :");	
		driver2=scan.nextDouble();
		System.out.println("enter speed of driver3 :");	
		driver3 =scan.nextDouble();
		System.out.println("enter speed of driver4 :");	
		driver4 =scan.nextDouble();
		System.out.println("enter speed of driver5 :");
		driver5=scan.nextDouble();
		
		double ave = ((driver1+driver2+driver3+driver4+driver5)/5);
		System.out.println("the speed of qualifying racers is: " +ave);
		
		}
		


	}



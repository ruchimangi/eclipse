package basics;
import java.util.Scanner;


public class lotus {
	public static void main(String[] args)
	{
		Scanner logical = new Scanner(System.in);
		
		System.out.println("you are taking the assesment! press b or B to continue");
		String response = logical.next();
		
		//if(response.equals("b") || response.equals("B")) {
			
		//System.out.println("continue in the assesment");
		
		//}
		
		//else {
		//	System.out.println("end the assesment");
		//}
		
		if(!response.equals("b") && !response.equals("B")) {
			
			System.out.println("continue in the assesment");
			
			}
			
			else {
				System.out.println("end the assesment");
			}
		
		
		
	}

}

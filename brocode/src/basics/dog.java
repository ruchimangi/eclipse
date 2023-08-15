package basics;
import java.util.Scanner;


public class dog {
	
	public static void main(String[] args)
	{
		Scanner school = new Scanner(System.in);
		
		//scanner for user input
		
		System.out.println("what is your name ?");
		String name = school.nextLine();
		
		System.out.println("how old are you ?");
		int age = school.nextInt();
		school.nextLine();
		
		
		System.out.println("your favourite food :");
		String food = school.nextLine();
		
		System.out.println("your name is "+name);
		System.out.println("you are "+age+ " old");
		System.out.println("you like "+food);
		
		
		
	}
	
	
}

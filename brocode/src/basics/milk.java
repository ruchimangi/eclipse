package basics;
import java.util.Scanner;


public class milk {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("enter your name:");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		System.out.println("hii "+name);
		
				
	}

}

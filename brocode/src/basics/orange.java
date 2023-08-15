package basics;
import java.util.Scanner;

public class orange {
	public static void main(String[] args) 
	{
		Scanner fruits = new Scanner(System.in);
		int rows;
		int columns;
		String symbol;
		
		System.out.println("enter the no.of rows:");
		rows = fruits.nextInt();
		
		System.out.println("enter the no.of columns:");
		columns = fruits.nextInt();
		
		System.out.println("enter the symbol to print:");
		symbol = fruits.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
		
		
		
		
		
		
		
	}

}

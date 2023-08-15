package basics;
import java.util.ArrayList;

public class tomato {
	public static void main(String[] args)
	{
		ArrayList<String> pets = new ArrayList();
		
		pets.add("cat");
		pets.add("dog");
		pets.add("rabbit");
		
		for(String i : pets) {
			System.out.println(i);
		}
		
		
	}

}

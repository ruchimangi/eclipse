package basics;
import java.util.ArrayList;


public class rabbit {
	public static void main(String[] args)
	{
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("biriyani");
		food.add("mushroom");
		food.add("raita");
		food.add("cool drink");
		
		
		food.set(1, "chicken");
		food.remove(3);
		
		
		for(int i=0; i<food.size(); i++) {
		System.out.println(food.get(i));
		}
		
	}

}

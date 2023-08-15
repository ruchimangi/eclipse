package basics;
import java.util.ArrayList;

public class slip {
	public static void main(String[] args)
	{
		
        ArrayList<ArrayList<String>> lunch = new ArrayList();
		
		ArrayList<String> riceitems = new ArrayList();
		
		riceitems.add("white rice");
		riceitems.add("fried rice");
		riceitems.add("jeera rice");
		
        ArrayList<String> liquids = new ArrayList();
		
		liquids.add("sambar");
		liquids.add("dal");
		liquids.add("chutney");
		
        ArrayList<String> curries = new ArrayList();
		
        curries.add("brinjal");
        curries.add("potato");
        curries.add("tomato");
        
        lunch.add(riceitems);
        lunch.add(liquids);
        lunch.add(curries);
        
        
        System.out.println(lunch.get(0).get(2));
        
		}

}

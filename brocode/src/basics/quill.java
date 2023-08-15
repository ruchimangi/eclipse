package basics;

public class quill {
	public static void main(String [] args)
	{
		String name = "     Ruchi    ";
		
		//boolean result = name.equals("Ruchi");
		//int result = name.length();
		//char result = name.charAt(3);
		//int result = name.indexOf("i");
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();	
		String result = name.replace('i','a');
		
		
		System.out.println(result);
	}

}

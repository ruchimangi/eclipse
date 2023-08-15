package basics;

public class pink {
	public static void main(String[] args)
	{
		//String[] cars = {"toyota","BMW","KIA"};
		
		//System.out.println(cars[1]);
		
		String[] cars = new String[3];
		
		cars[0] = "toyota";
		cars[1] = "BMW";
		cars[2]	= "KIA";
		
		for(int i=0; i<cars.length; i++)
		{
			System.out.println(cars[i]);
		
		}
	}

}

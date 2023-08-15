package laptop;

public class aeroplane {
	public static void main(String[] args)
	{
		int[] arr = {10,15,20,25,30};
		
        int sum = findSum(arr);
		
		System.out.println("sum of array is:"+sum);
		
		
	}
	
	public static int findSum(int[] arr)
	{
		
        int sum = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		return sum;
	}
	{
		
	}

}

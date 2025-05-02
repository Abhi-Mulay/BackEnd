package File_Handling_All_File;

import java.util.*;
public class natural_no_sum
{
	static int sum;

	public static void naturalApp(int n)
	{
		if(n==0)
		{			
			return;
		}
		sum+=n;

		naturalApp(n-1);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		naturalApp(n);
		System.out.println(sum);
	}
}
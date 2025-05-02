//Find a pair in an array that sums to a specific value
//Find two elements in the array that sum to a given target value.

package Date_20_02_2025;
import java.util.*;

public class Q22_Pair_Array_sum {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0 ;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int sum=a[i]+a[j];
				if(sum==n)
				{
					System.out.println(a[i]+"<--->"+a[j]+"------>"+sum);
				}
			}	
		}
	}
}

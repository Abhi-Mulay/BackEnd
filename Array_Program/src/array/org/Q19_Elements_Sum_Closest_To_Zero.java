package array.org;
import java.util.*;

public class Q19_Elements_Sum_Closest_To_Zero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1 ; j<a.length ; j++)
			{
				int sum=a[i]+a[j];
				if(sum<=0 || sum>=0)
				{
					System.out.println(a[i]+"\t "+a[j]);
				}
			}
		}
		
	}

}

package array.org;
import java.util.*;

public class Q12_Find_Pair_Sum_Same {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int a[]=new int[size];
		
		for(int i=0 ; i<a.length ; i++)	
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=0;i<a.length ; i++)
		{
		
			for(int j=i+1;j<a.length ; j++)
			{
				sum=a[i]+a[j];
				if(sum==n)
				{
					System.out.println(i+","+j);
				}
			}
			
		}
		
		
	}

}

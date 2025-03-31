package array_23_02_2025;
import java.util.*;

public class Q9_Find_Nth_Highest_Elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0 ;i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1; j<a.length ;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0 ;i<a.length ;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the number to find highest elements ");
		int n=sc.nextInt();
		
		int count=0;
		int flag=0;
		for(int i=0 ;i<a.length-1 ; i++)
		{
			if(a[i]>a[i+1])
			{
				count++;
			}
			if(count==n)
			{
				System.out.println(n+" heighest element is "+a[i]);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("invalid");
		}
		
	}

}

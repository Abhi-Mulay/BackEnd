package array.org;
import java.util.*;

public class Q9_Separate_Odd_Even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[size];
		int c[]=new int[size];
		
		int m=0;
		int n=0;
		
		for(int i=0 ; i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[m++]=a[i];
			}
			else {
				c[n++]=a[i];
			}
		}
		
		
		System.out.println("Even numbers ");
		for(int i=0;i<m;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("Odd number");
		for(int i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
		
		
	}

}

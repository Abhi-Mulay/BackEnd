package loop.org.test;
import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[]=new int[size];
		for(int i=0 ; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[size];
		
		System.out.println("Enter the value");
		int val=sc.nextInt();
		int k=0;
		for(int i=0;i<a.length ;i++)
		{
				if(a[i]!=val)
				{
					b[k++]=a[i];
				}
				
		}
		int n=b[0];
		System.out.println("The first elemensts are "+n+"\n");
		for(int i=0;i<b.length ;i++)
		{
			System.out.println(b[i]);
		}
		
	}

}

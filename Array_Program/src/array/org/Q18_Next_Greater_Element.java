package array.org;
import java.util.*;

public class Q18_Next_Greater_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			int flag=-1;
			for(int j=i+1; j <a.length; j++)
			{
				if(a[i]<a[j])
				{
					
					flag=a[j];
					break;
				}
				
			}
			b[i]=flag;
			
		}
		
		for(int i=0;i<b.length;i++) 
		{
			System.out.println("Next bigger element of "+a[i]+" in the array is: "+b[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}

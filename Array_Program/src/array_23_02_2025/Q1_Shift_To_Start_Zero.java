package array_23_02_2025;
import java.util.*;

public class Q1_Shift_To_Start_Zero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[j++]=a[i];
			}
		}
		
		while(j<a.length)
		{
			a[j++]=0;
		}
			
		
		System.out.println("\nZero's at ending");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int m=a.length-1;
		for(int i=a.length-1;i>=0 ;i--)
		{
			if(a[i]!=0)
			{
				a[m--]=a[i];
			}
		}
		
		while(m>=0)
		{
			a[m--]=0;
		}
		System.out.println("\nZero's at Starting");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
//1 0 9 3 5 0 8 3 0 5 
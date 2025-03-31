package array.org;

import java.util.*;

public class Q2_Sum_Array_Values {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<a.length; i++)
		{
			sum+=a[i];
		}
		
		System.out.println("sum  "+sum);
		
	}

}

package oopProgram;
/*Q14. Write a java program to create class name as ArrayOperation using contsructor overloading name as :

	ArrayOperation(int [ ])
	{
		//  Sort Array Ascending and Descending Order.
	}
	
	ArrayOperation(int a[ ] , int b[ ])
	{
		//  Merge Two Array and display it.
	}
	
 
*/

import java.util.*;
class ArrayOperation
{
	ArrayOperation(int a[]){
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nIn Ascending order");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.print("\nIn Descending order");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	ArrayOperation(int a[], int b[]){
		int c[]=new int[a.length+b.length];
		
		int k=0;

		for (int i = 0; i < a.length; i++) {
			c[k++]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[k++]=b[i];
		}
		
		System.out.print("\nAfter Merging two array");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
public class Q14_ArrayOperation_using_contsructor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the size of first array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		

		System.out.println("Enter the size of array");
		int size2=sc.nextInt();
		
		int b[]=new int[size2];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		
		ArrayOperation a1 = new ArrayOperation(a);
		ArrayOperation a2 = new ArrayOperation(a,b);
	}

}

package intermediateProgram;
/*12. Remove Duplicates from Sorted Array
Description: Remove duplicates from a sorted array and return the new length.


Input: [1, 1, 2]


Output: 2*/

import java.util.*;

public class Q12_Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the Array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int k=0;
		for (int i = 1; i < a.length; i++) {
			if(a[i]!=a[k]) {
				k++;
				a[k]=a[i];
				
			}
		}
		
		System.out.println(k+1);
	}

}

package programOnArray;

import java.util.Scanner;

/*2. Find Maximum Element in Array
Description: Find the largest element in an array.


Input: [12, 34, 56, 78, 23]


Output: 78
*/
import java.util.*;
public class Q2Find_Maximum_Element_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}

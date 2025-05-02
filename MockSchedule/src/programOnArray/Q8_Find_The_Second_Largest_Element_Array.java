package programOnArray;

import java.util.Scanner;

/*8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.


Input: [10, 20, 30, 40, 50]


Output: 40*/
public class Q8_Find_The_Second_Largest_Element_Array {

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
		int second=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(max!=a[i]) {
				if(!false || second<a[i]) {
					second=a[i];
					found=true;
				}
			}
			
		}
		
		System.out.println("the Second Largest Element in Array is "+second);
	}

}

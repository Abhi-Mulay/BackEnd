package programOnArray;

import java.util.Scanner;

/*7. Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.


Input: [1, 2, 2, 3, 4, 2, 5], element 2


Output: 3*/
public class Q7_Find_The_Frequency_Element_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		System.out.println("Enter the element to find");
		int no=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i] == no) {
				count++;
			}
		}

		System.out.println(count);
	}

}

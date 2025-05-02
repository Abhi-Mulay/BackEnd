package intermediateProgram;
/*1. Find the Majority Element in an Array
Description: Write a program to find the element that appears more than n/2 times in the array. If no such element exists, return -1.


Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]


Output: 4*/
import java.util.*;
public class Q1_Find_the_Majority_Element_in_an_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>a.length/2) {
				System.out.println(a[i]);
				break;
			}
		}
		
	}

}

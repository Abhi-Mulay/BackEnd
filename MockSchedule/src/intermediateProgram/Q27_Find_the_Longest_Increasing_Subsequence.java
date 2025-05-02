package intermediateProgram;
/*27. Find the Longest Increasing Subsequence
Description: Write a program to find the length of the longest strictly increasing subsequence in an array.


Input: [10, 9, 2, 5, 3, 7, 101, 18]


Output: 4*/
import java.util.*;
public class Q27_Find_the_Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
				if(a[i]==a[i+1]-1) {
					count++;
				}
		}
		System.out.println(count);
	}

}

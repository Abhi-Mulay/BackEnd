package intermediateProgram;
/*19. Find the Longest Consecutive Sequence
Description: Find the length of the longest consecutive elements sequence.


Input: [100, 4, 200, 1, 3, 2]
100 4 200 1 3 2

Output: 4


*/

import java.util.*;
public class Q19_Find_the_Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int count=1;
		
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

package intermediateProgram;
/*3. Array Pair Sum
Description: Write a program to find all pairs in an array whose sum equals a given target.


Input: [1, 4, 5, 3, 2], target 6


Output: [(4, 2), (5, 1)]
*/
import java.util.*;
public class Q3_Array_Pair_Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the array size");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target");
		int target=sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}

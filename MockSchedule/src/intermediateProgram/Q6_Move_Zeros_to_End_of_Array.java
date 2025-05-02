package intermediateProgram;
/*6. Move Zeros to End of Array
Description: Move all zero elements of an array to the end while maintaining the order of other elements.


Input: [0, 1, 2, 0, 3, 4]


Output: [1, 2, 3, 4, 0, 0]


*/

import java.util.*;
public class Q6_Move_Zeros_to_End_of_Array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the element");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				if(a[j]==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

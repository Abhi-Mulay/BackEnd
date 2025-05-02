package programOnArray;
/*

15. Rotate Array by N Positions
Description: Rotate the array by n positions to the right.


Input: [1, 2, 3, 4, 5], n = 2


Output: [4, 5, 1, 2, 3]
*/
import java.util.*;
public class Q15Rotate_Array_By_N_Positions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the index to rotate array");
		int index=sc.nextInt();
		
		for(int i=0 ;i<index;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}

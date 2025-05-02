package programOnArray;
/*16. Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.


Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]

//-2 1 -3 4 -1 2 1 -5 4
Output: 6*/
import java.util.*;
public class Q16_Find_the_Largest_Sum_Contiguous_Subarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}

		int sum=a[0];
		int sum2=a[0];
		for(int i=1;i<a.length;i++) {
			if(sum>a[i]) {
				sum+=a[i];
			}
			else {
				sum=a[i];
			}
			if(sum>sum2) {
				sum2=sum;
			}
		}
		System.out.println(sum2);
	}

}

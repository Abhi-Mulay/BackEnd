package programOnArray;
/*4. Sum of Elements in Array
Description: Calculate the sum of all elements in an array.


Input: [1, 2, 3, 4, 5]


Output: 15


*/
import java.util.*;
public class Q4_Sum_Of_Elements_Of_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}

		System.out.println(sum);
	}

}

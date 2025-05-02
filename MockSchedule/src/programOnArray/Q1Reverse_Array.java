package programOnArray;
/*1. Reverse an Array
Description: Reverse the order of elements in an array.


Input: [1, 2, 3, 4, 5]


Output: [5, 4, 3, 2, 1]


*/
import java.util.*;

public class Q1Reverse_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length/2;i++) {
			int temp=a[size-1-i];
			a[size-1-i]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}

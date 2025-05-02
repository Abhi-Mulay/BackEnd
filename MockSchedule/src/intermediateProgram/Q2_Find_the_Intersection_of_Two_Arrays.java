package intermediateProgram;
/*2. Find the Intersection of Two Arrays
Description: Write a program to find the common elements in two arrays.


Input: [1, 2, 2, 1], [2, 2]


Output: [2, 2]


*/
import java.util.*;
public class Q2_Find_the_Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the array size");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array size");
		int size2=sc.nextInt();
		
		int b[]=new int[size2];
		
		System.out.println("Enter the elements");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}
		
	}

}

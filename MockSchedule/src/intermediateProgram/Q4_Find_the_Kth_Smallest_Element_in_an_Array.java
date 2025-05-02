package intermediateProgram;
/*4. Find the Kth Smallest Element in an Array
Description: Find the kth smallest element in an unsorted array.


Input: [12, 3, 5, 7, 19], k = 2
Output: 5

*/
import java.util.*;
public class Q4_Find_the_Kth_Smallest_Element_in_an_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Enter the index");
		int index=sc.nextInt();
		
		for (int i = 0; i < a.length; i++) {
			if(i==(index-1)) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}

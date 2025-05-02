package intermediateProgram;
/*26. Find the Unique Element in an Array
Description: Find the element that appears only once in an array where all other elements appear twice.


Input: [1, 2, 3, 2, 1]


Output: 3*/
import java.util.*;

public class Q26Find_the_Unique_Element_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
	}

}

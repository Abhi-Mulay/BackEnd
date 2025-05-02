package programOnArray;
/*3. Find Minimum Element in Array
Description: Find the smallest element in an array.


Input: [10, 20, 30, 5, 15]


Output: 5*/
import java.util.*;
public class Q3_Find_Minimum_Element_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}

package programOnArray;
/*18. Check if Array Contains a Specific Element
Description: Check if a specific element exists in an array.


Input: [1, 2, 3, 4], element 3


Output: Found


*/
import java.util.*;

public class Q18Check_Array_Contains_Specific_Element {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the shearch element");
		int search=sc.nextInt();
		
		boolean flag=false;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == search) {
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Value Found");
		}
		else {
			System.out.println("Value Not Found");
		}
		}

}

package programOnArray;
/*12. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.


Input: [1, 2, 3, 4, 5, 1, 3]


Output: [1, 3]
*/
import java.util.*;
public class Q12_Find_The_Duplicate_Elements_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						
						System.out.println(a[i]);
						flag=true;
						break;
					
					}
				}
			
		}
		if(!flag) 
			System.out.println("No duplicates found");
		
	}

}

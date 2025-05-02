package programOnArray;
/*17. Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.


Input: [1, 2, 4, 5]


Output: 3


*/
import java.util.Scanner;

public class Q17Find_Missing_Number_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length-1;i++) {
			for(int j=a[i]+1;j<a[i+1];j++) {
				System.out.println(j);
			}
		}
	}

}

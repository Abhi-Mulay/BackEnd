package programOnArray;
/*13. Sort Array in Ascending Order
Description: Sort the elements of the array in ascending order.


Input: [10, 2, 30, 4, 5]


Output: [2, 4, 5, 10, 30]
*/
import java.util.*;
public class Q13_Sort_Array_Ascending_Order {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
	}

}

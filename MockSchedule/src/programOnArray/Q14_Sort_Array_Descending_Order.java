package programOnArray;
/*14. Sort Array in Descending Order
Description: Sort the elements of the array in descending order.


Input: [10, 2, 30, 4, 5]


Output: [30, 10, 5, 4, 2]


*/
import java.util.Scanner;

public class Q14_Sort_Array_Descending_Order {

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
				if(a[i]<a[j]) {
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

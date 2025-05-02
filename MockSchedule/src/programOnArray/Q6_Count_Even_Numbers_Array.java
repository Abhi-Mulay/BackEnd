package programOnArray;
/*6. Count Even Numbers in Array
Description: Count how many even numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3*/
import java.util.Scanner;
public class Q6_Count_Even_Numbers_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}

		System.out.println(count);
	}

}

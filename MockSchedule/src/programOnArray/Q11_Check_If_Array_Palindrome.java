package programOnArray;
/*11. Check if Array is Palindrome
Description: Check if an array is the same when reversed.


Input: [1, 2, 3, 2, 1]


Output: Palindrome*/
import java.util.*;
public class Q11_Check_If_Array_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int c[]=new int[a.length];
		
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			c[k++]=a[i];
		}
		
		for(int i=0;i<c.length/2;i++) {
			int temp=c[size1-1-i];
			c[size1-1-i]=a[i];
			c[i]=temp;
		}
		
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=c[i]) {
				flag=false;
				break;
			}
		}
		System.out.println("😊------------------A------------😊");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n😊------------------C------------😊");
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		if(flag) {
			System.out.println("\nArray is Palindrome");
		}
		else {
			System.out.println("\nArray is Not Palindrome");
		}
	}

}

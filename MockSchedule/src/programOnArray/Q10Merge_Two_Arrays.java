package programOnArray;
/*10. Merge Two Arrays
Description: Merge two arrays into one.


Input: [1, 2, 3], [4, 5, 6]


Output: [1, 2, 3, 4, 5, 6]*/
import java.util.Scanner;

public class Q10Merge_Two_Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of First array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		
		System.out.println("Enter the first array elements");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size second array");
		int size2=sc.nextInt();
		
		int b[]=new int[size2];
		
		System.out.println("Enter the second array elements");
		
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int l=a.length+b.length;
		int c[]=new int[l];
		
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			c[k++]=a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			c[k++]=b[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}

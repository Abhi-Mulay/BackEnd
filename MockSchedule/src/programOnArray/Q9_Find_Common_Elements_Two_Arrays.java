package programOnArray;
import java.util.*;
/*9. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.


Input: [1, 2, 3, 4], [3, 4, 5, 6]


Output: [3, 4]*/
import java.util.*;
public class Q9_Find_Common_Elements_Two_Arrays {

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
		boolean bb[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			
			if(!bb[i]) {
				
				for(int j=0;j<b.length;j++) {
					
					if(!bb[j]) {
						
						if(a[i]==b[j]) {
							
							System.out.println(a[i]);
							bb[i]=true;
							bb[j]=true;
							break;
							
						}
						
					}
				}
			}
		}
	}

}

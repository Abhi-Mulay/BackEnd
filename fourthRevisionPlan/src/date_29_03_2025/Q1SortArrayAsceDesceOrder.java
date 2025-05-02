//Q1. Write java program to sort array in ascending and descending order.
package date_29_03_2025;
import java.util.*;

public class Q1SortArrayAsceDesceOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

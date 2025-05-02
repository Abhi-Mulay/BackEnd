//Q3. Merging Multiple Lists
// Description: Merge two ArrayLists into one while ensuring no duplicates are present. Print the merged list sorted by item names.

package date_15_03_2025;
import java.util.*;
public class Q3_Merging_Multiple_Lists {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		List l3 = new ArrayList();
		List l4 = new ArrayList();

		System.out.println("Enter the first arrayList");
		for(int i=1;i<=3;i++) {
			l1.add(sc.nextInt());
		}
		
		System.out.println("Enter the second arrayList");
		for(int i=1;i<=3;i++) {
			l2.add(sc.nextInt());
		}
		
		System.out.println("Enter the third arrayList");
		for(int i=1;i<=3;i++) {
			l3.add(sc.nextInt());
		}
		
		System.out.println("Enter the fourth arrayList");
		for(int i=1;i<=3;i++) {
			l4.add(sc.nextInt());
		}
		
		System.out.println("After merging the multiple list");
		
		l1.add(l2);
		l1.add(l3);
		l1.add(l4);
		
		System.out.println(l1);
	}

}

//Q4. Finding Common Elements Between Two Lists
// Description: Given two HashSet objects (representing skills of two employees),
// find and print the skills that are common to both.

package date_15_03_2025;
import java.util.*;
public class Q4_Finding_Common_Elements_Between_Two_Lists {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> l1=new ArrayList();
		
		List<String> l2=new ArrayList();
		
		System.out.println("Enter the first arrayList");
		for(int i=1;i<=3;i++) {
			l1.add(sc.nextLine());
		}
		
		System.out.println("Enter the second arrayList");
		for(int i=1;i<=3;i++) {
			l2.add(sc.nextLine());
		}
		HashSet<String> h1 = new HashSet(l1);
		h1.retainAll(l2);
		
		//HashSet<String> h2 = new HashSet(l2);
		System.out.println(h1);
		
		
	}

}

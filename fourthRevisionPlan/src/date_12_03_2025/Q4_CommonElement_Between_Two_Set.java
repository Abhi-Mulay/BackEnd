//Q4. Finding Common Elements Between Two Sets
//Write a program that takes two HashSet objects and prints the elements that are common to both

package date_12_03_2025;
import java.util.*;

public class Q4_CommonElement_Between_Two_Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> h1=new HashSet();
		HashSet<Integer> h2=new HashSet();
		
		System.out.println("Enter the size of first set");
		int size1=sc.nextInt();
		System.out.println("\nEnter the elements\n");
		for(int i=1;i<=size1;i++) {
			h1.add(sc.nextInt());
		}
		System.out.println("Enter the size of second set");
		int size2=sc.nextInt();
		System.out.println("\nEnter the elements\n");
		for(int i=1;i<=size2;i++) {
			h2.add(sc.nextInt());
		}
		
			List <Integer>list=new ArrayList(h1);
			list.retainAll(h2);
			
			System.out.println(list);
			
	}

}

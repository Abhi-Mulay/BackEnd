//Q2. Remove Duplicates Using Set
//Write a program that removes duplicate elements from a List using a HashSet and prints the cleaned list.

package date_12_03_2025;
import java.util.*;

public class Q2_Remove_Duplicate_Using_Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of size of list");
		
		List <Integer>l=new ArrayList();
		for(int i=0;i<5;i++) {
			l.add(sc.nextInt());
		}
		
		HashSet list=new HashSet(l);
		
		
		System.out.println(list);
		
		
	}

}

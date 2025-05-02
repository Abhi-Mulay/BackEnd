// Q2. Remove Duplicate Names Using Set
// Description: Given a list of names that may contain duplicates, use a HashSet to remove duplicate names and print the cleaned-up list.

package date_15_03_2025;
import java.util.*;

public class Q2_RemoveDuplicateNames_Using_Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList();
		
		
		
		for(int i=1;i<=10;i++) {
			list.add(sc.nextLine());
		}
		
		Set set=new HashSet(list);
		
		System.out.println(set);
		
	}

}

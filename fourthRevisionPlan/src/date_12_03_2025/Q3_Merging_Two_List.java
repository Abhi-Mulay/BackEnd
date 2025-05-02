//Q3. Merging Two Lists
//Merge two ArrayList objects into one, making sure that the merged list does not contain duplicates.

package date_12_03_2025;
import java.util.*;

public class Q3_Merging_Two_List {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList();
		
		for(int i=1;i<=5;i++) {
			list1.add(sc.nextInt());
		}
		
		ArrayList<Integer> list2 = new ArrayList();
		
		for(int i=1;i<=5;i++) {
			list2.add(sc.nextInt());
		}
		
			
		Set<Integer> result=new HashSet(list1);
		result.addAll(list2);
		
		List<Integer> l=new ArrayList(result);
		
		
			System.out.println(l);
		
		
	}

}

//7. Find the Common Keys Between Two Maps
//Write a program that finds the common keys between two Map objects 
//and outputs them in a set.
//Example:
//Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
//Map<String, Integer> map2 = Map.of("b", 3, "c", 4, "d", 5);
//Output: {"b", "c"}

package date_16_03_2025;
import java.util.*;
public class Q7_Common_Keys_Between_Two_Maps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map1 = new HashMap();
		
		Map<String, Integer> map2 = new HashMap();
		
		for(int i=1;i<=3;i++) {
			String n=sc.nextLine();
			int no=sc.nextInt();
			sc.nextLine();
			
			map1.put(n,no);
		}
		
		for(int i=1;i<=3;i++) {
			String n=sc.nextLine();
			int no=sc.nextInt();
			sc.nextLine();
			
			map2.put(n,no);
		}
		
		Set<String> commun=new HashSet<>(map1.keySet());
		commun.retainAll(map2.keySet());
			System.out.println(commun);
		
		
	}

}

//9. Invert a Map
//Write a program to invert a Map. This means swapping the keys with the values. If the values are not unique, decide on a policy for handling the duplication (for example, store multiple values in a List).
//Example:
//Input: {"a": 1, "b": 2, "c": 3}
//Output: {1="a", 2="b", 3="c"}

package date_16_03_2025;
import java.util.*;
public class Q9_Invert_Map {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map=new HashMap();
		
		for (int i = 1; i <= 3; i++) {
			String n = sc.nextLine();
			int no = sc.nextInt();
			sc.nextLine();

			map.put(n, no);
		}
		
		Map<Integer,String> map2 = new HashMap();
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			map2.put(entry.getValue(), entry.getKey());
		}
		

		System.out.println("orignal ");
		System.out.println(map);
		
		System.out.println("After swap");
		System.out.println(map2);
	
		
		
	}

}

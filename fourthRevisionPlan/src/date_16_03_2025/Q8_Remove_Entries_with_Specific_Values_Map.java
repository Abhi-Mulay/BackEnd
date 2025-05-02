//8. Remove Entries with Specific Values in a Map
//Write a program that removes entries from a map that have a specific value.
//Example:
//Input: Map<String, Integer> map = {"a": 1, "b": 2, "c": 1};
//Output after removing value 1: {"b": 2}

package date_16_03_2025;

import java.util.*;

public class Q8_Remove_Entries_with_Specific_Values_Map {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap();

		for (int i = 1; i <= 3; i++) {
			String n = sc.nextLine();
			int no = sc.nextInt();
			sc.nextLine();

			map.put(n, no);
		}
		
		System.out.println("Enter the value to remove");
		int v=sc.nextInt();

		System.out.println(map);
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue().equals(v)) {
				map.remove(entry.getKey());
				break;
			}
		}
		
		System.out.println(map);
	}

}

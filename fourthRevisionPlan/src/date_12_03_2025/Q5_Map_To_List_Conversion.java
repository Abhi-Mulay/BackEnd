//Q5.  Map to List Conversion
//Write a program that converts a HashMap to a list of entries and then sorts the list by the keys

package date_12_03_2025;
import java.util.*;

public class Q5_Map_To_List_Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer,String> map=new HashMap(); 
		
		for(int i=1;i<=5;i++) {
			map.put(sc.nextInt(),sc.nextLine());
		}
		List<Map.Entry<Integer, String>> list=new ArrayList(map.entrySet());
		
		list.sort(Map.Entry.comparingByKey());

		System.out.println(list);
		
		for(Map.Entry<Integer, String> m:list) {
			System.out.println(m.getKey());
		}
	}

}

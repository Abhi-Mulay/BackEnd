//4. Merge Two Maps
//Write a program that merges two Map objects. If the same key exists in both maps, sum their values.
//Example:
//Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
//Map<String, Integer> map2 = Map.of("b", 3, "c", 4);
//Output: {"a": 1, "b": 5, "c": 4}

package date_16_03_2025;
import java.util.*;
public class Q4_Merege_Two_Map {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map1 = new HashMap();
				
		Map<String, Integer> map2 = new HashMap();
		
		System.out.println("Enter the first hashMap element");
		for(int i=1;i<=3;i++) {
			String s=sc.nextLine();
			
			int n= sc.nextInt();
			sc.nextLine();
			map1.put(s,n);
		}
		
		System.out.println("Enter the second hashMap element");
		for(int i=1;i<=3;i++) {
			String s=sc.nextLine();
			
			int n= sc.nextInt();
			sc.nextLine();
			map2.put(s,n);
		}
		
		for(Map.Entry<String, Integer> entry : map2.entrySet()) {
			map1.merge(entry.getKey(),entry.getValue(), Integer::sum);
		}
		System.out.println(map1);
	}

}

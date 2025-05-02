//10. Group Elements by Their Length
//Write a program that groups strings by their length using a Map<Integer, List<String>>.
//The key will be the length of the strings, and the value will be a list of strings that
//have that length.
//Example:
//Input: ["apple", "banana", "cat", "dog", "elephant"]
//Output: {3=["cat", "dog"], 5=["apple"], 6=["banana"], 8=["elephant"]}

package date_16_03_2025;
import java.util.*;
public class Q10_Group_Elements_by_Their_Length {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String []list = new String[5];
		
		Map<Integer, List<String>> map = new HashMap();
		
		for(int i=0;i<list.length;i++) {
			list[i]=sc.nextLine();
		}
		
		for(String word:list) {
			int count=word.length();
			
			map.computeIfAbsent(count, k -> new ArrayList()).add(word) ;
			
		}
		for(Map.Entry<Integer, List<String>> m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}

}

//Q1. Word Frequency Counter Using HashMap
// Description: Given a paragraph of text, use a HashMap to count the frequency of each word in the text. Display each word and its frequency.

package date_15_03_2025;
import java.util.*;
public class Q1_WordFrequencyCount_Using_HashMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the paragram");
		String paragrap=sc.nextLine();
		
		HashMap <String , Integer>map=new HashMap();
		
		String []s=paragrap.split("\\s+");
		
		for(int i=0;i<s.length;i++) {
			Integer count=map.get(s[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map.put(s[i], count);
		}
//		we can also use following logic
//		for(String word:s) {
//			map.put(word,map.getOrDefault(word,0)+1);
//		}
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}

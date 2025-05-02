//2. Count Words in a String
//Write a program to count the occurrences of each word in a given string. Use a Map<String, Integer> to store the word and its count.
//Example:
//Input: "this is a test this is a test"
//Output: {this=2, is=2, a=2, test=2}

package date_16_03_2025;
import java.util.*;

public class Q2_Count_Words_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String n=sc.nextLine();
		
		String s[]=n.split("\\s+");
		
		HashMap<String , Integer> map = new HashMap();
		
		for(int i=0;i<s.length;i++) {
			Integer count=map.get(s[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map.put(s[i], count);
		}
		
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

}

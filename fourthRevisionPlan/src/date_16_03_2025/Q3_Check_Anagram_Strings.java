//3. Check for Anagram Strings
//Write a program that checks if two strings are anagrams of each other. Use a Map<Character, Integer> 
//to track the frequency of each character in both strings.
//Example:
//Input: "listen", "silent"
//Output: true

package date_16_03_2025;
import java.util.*;
public class Q3_Check_Anagram_Strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Map<Character, Integer> map1=new HashMap();
		Map<Character, Integer> map2=new HashMap();
		
		for(int i=0;i<c1.length;i++) {
			Integer count=map1.get(c1[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map1.put(c1[i], count);
		}
		
		for(int i=0;i<c2.length;i++) {
			Integer count=map2.get(c2[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map2.put(c2[i], count);
		}
		
		if(map1.equals(map2)) {
			System.out.println("String is Anagram string");
		}
		else {
			System.out.println("String is Not Anagram string");
		}
		
		
		
	}

}

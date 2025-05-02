package programOnArray;
/*

24. Check if Two Strings are Anagrams
Description: Check if two strings are anagrams of each other.


Input: "listen", "silent"


Output: Anagram
*/
import java.util.*;
public class Q24_Check_Two_Strings_are_Anagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the String");
		String s2=sc.nextLine();

		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int count=0;

		
		for (int i = 0; i < ch1.length; i++) {

				for (int j = 0; j < ch2.length; j++) {
					if(ch1[i]==ch2[j]) {
						count++;
						break;
					}
				}

		}
		if((count==s1.length()) && count==s2.length()) {
		System.out.println(count);
		}
		else {
			System.out.println("Not an anagram");
		}
	}

}

package programOnArray;
/*25. Replace All Occurrences of a Character in String
Description: Replace all occurrences of a character in a string with another character.


Input: "hello", o -> x


Output: "hellx"
*/

import java.util.*;
public class Q25_Replace_All_Occurrences_Character_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the character from string to replace");
		char ch1=sc.next().charAt(0);
		
		System.out.println("Enter the another character to be replace with "+ch1);
		char ch2=sc.next().charAt(0);
		
		char ch[]=s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==ch1) {
				ch[i]=ch2;
			}
		}
		
		String str=new String(ch);
		
		System.out.println(str);
	}

}

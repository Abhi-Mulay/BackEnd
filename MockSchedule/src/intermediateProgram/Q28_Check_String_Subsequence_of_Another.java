package intermediateProgram;
/*28. Check if a String is a Subsequence of Another
Description: Check if a string is a subsequence of another string.


Input: "abc", "ahbgdc"


Output: true
*/

import java.util.*;

public class Q28_Check_String_Subsequence_of_Another {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the sub string");
		String s2=sc.nextLine();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int count=0;
		for (int i = 0; i < ch1.length; i++) {

			for (int j = 0; j < ch2.length; j++) {
			
				if(ch1[i] == ch2[j]) {
						count++;
						break;
					}
				
			}
			
		}
		if(count <= ch1.length) {

			System.out.println("True");	
		}
		else {

			System.out.println("false");
			
		}
	}

}

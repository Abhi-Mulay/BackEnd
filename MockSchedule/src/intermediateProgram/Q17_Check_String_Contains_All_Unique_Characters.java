package intermediateProgram;
/*17. Check if String Contains All Unique Characters
Description: Check if a string contains all unique characters.


Input: "abcdef"


Output: true


*/

import java.util.*;
public class Q17_Check_String_Contains_All_Unique_Characters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		boolean b=false;
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
				}	
			}
			if(count==1) {
				b=true;
			}	
			else {
				b=false;
				break;
			}
		}
		
		if(b) {
			System.out.println(b);
		}
		else {
			System.out.println(b);
		}
	}
		
}


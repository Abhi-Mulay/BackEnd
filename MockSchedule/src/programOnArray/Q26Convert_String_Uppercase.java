package programOnArray;
/*26. Convert String to Uppercase
Description: Convert a string to uppercase.


Input: "hello"


Output: "HELLO"*/

import java.util.*;
public class Q26Convert_String_Uppercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		String str=new String(ch);
		
		System.out.println(str);
		
		
	}

}

package programOnArray;
/*21. Check if a String is Palindrome
Description: Check if the given string is a palindrome.


Input: "madam"


Output: Palindrome
*/
import java.util.*;
public class Q21_Check_String_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String s1=s;
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length/2; i++) {
			char temp=ch[ch.length-1-i];
			ch[ch.length-1-i]=ch[i];
			ch[i]=temp;
		}
		
		String s2=new String(ch);
		
		System.out.println(s2);
		
		if(s2.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}

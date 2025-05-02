package programOnArray;
/*38. Replace Substring in String
Description: Replace a part of a string with another substring.


Input: "hello world", old substring "world", new substring "java"


Output: "hello java"*/
import java.util.*;
public class Q38_Replace_Substring_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		
		System.out.println("Enter the sub string to replace");
		String s1=sc.nextLine();
		
		System.out.println("Enter the sub String replace with "+s1);
		String s2=sc.nextLine();

		String str[]=s.split(" ");
		
		String result="";
		for (int i = 0; i < str.length ; i++) {
			if(str[i].equals(s1)) {
				str[i]=s2;
			}
			result+=str[i]+" ";
		}
		
		
		System.out.println(result);
		
	}

}

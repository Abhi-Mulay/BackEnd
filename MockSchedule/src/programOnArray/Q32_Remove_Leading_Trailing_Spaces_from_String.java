package programOnArray;
/*32. Remove Leading and Trailing Spaces from String
Description: Remove any leading and trailing spaces from a string.


Input: " hello "


Output: "hello"*/
import java.util.*;
public class Q32_Remove_Leading_Trailing_Spaces_from_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		char ch[]=s1.toCharArray();
		
		String s[]=s1.split(" ");
		String newStr="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				newStr=newStr+ch[i];
			}
		}
		
		System.out.println(newStr);
	}

}

package intermediateProgram;
/*20. Check If String is a Valid Number
Description: Write a program to check if a string represents a valid number.


Input: "123.45"


Output: true
*/
import java.util.*;
public class Q20_Check_String_Valid_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		boolean flag=false;
		for (int i = 0; i < ch.length; i++) {
			if((ch[i]=='-' || ch[i]=='.') || (ch[i]>='0' && ch[i]<='9')) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(flag);
		}
		else {
			System.out.println(flag);
		}	
	}

}

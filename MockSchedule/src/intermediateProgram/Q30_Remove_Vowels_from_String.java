package intermediateProgram;
/*30. Remove Vowels from a String
Description: Remove all vowels from a given string.


Input: "hello"


Output: "hll"*/
import java.util.*;
public class Q30_Remove_Vowels_from_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		String newStr="";
		for (int i = 0; i < ch.length; i++) {
			if(!(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' ||ch[i]=='u' || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' || ch[i]=='O' ||ch[i]=='U'))
			{
				newStr=newStr+ch[i];
			}
		}
		
		System.out.println(newStr);
	}

}

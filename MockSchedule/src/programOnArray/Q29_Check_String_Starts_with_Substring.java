package programOnArray;
/*29. Check if String Starts with a Substring
Description: Check if a string starts with a specific substring.


Input: "hello", substring "he"


Output: Starts with "he"*/
import java.util.*;

public class Q29_Check_String_Starts_with_Substring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		
		System.out.println("Enter the subString string ");
		String s2=sc.nextLine();

		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int count=0;
		
		for (int i = 0; i < ch2.length; i++) {
			if(ch1[i]==ch2[i]) {
				count++;
			}
			
		}
		
		if(count == ch2.length) {
			System.out.println("String is start with  "+s2);
		}	
		else {
			System.out.println("Not String is start with  "+s2);
		}
	}

}

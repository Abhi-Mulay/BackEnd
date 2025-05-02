package programOnArray;
/*28. Find the Length of a String
Description: Find the length of a given string.


Input: "hello"


Output: 5
*/
import java.util.*;

public class Q27_Convert_String_Lowercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		int count=s.length();
		
		System.out.println("length of string is  "+count);
	}

}

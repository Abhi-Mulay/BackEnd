package programOnArray;
/*40. Check if String Contains Another String
Description: Check if a string contains another string.


Input: "hello world", substring "world"


Output: Contains "world"

*/
import java.util.*;
public class Q40_Check_if_String_Contains_Another_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		
		System.out.println("Enter the sub string to replace");
		String s1=sc.nextLine();
		
		String str[]=s.split(" ");
		
		for (int i = 0; i < str.length ; i++) {
			if(str[i].equals(s1)) {
				System.out.println("Contains "+s1);
				break;
			}
		}
		
		
				
	}

}

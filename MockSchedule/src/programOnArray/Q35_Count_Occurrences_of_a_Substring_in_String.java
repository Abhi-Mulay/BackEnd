package programOnArray;
/*35. Count Occurrences of a Substring in String
Description: Count how many times a substring occurs in a string.


Input: "hello world hello", substring "hello"


Output: 2


*/
import java.util.*;
public class Q35_Count_Occurrences_of_a_Substring_in_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String s1=sc.nextLine();

		System.out.println("Enter the sub String");
		String s2=sc.nextLine();
		
		String str[]=s1.split(" ");
		
		int count=0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(s2)) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}

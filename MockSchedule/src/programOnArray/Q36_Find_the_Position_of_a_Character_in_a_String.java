package programOnArray;
/*36. Find the Position of a Character in a String
Description: Find the index of a specific character in a string.


Input: "hello", character o


Output: 4


*/
import java.util.*;

public class Q36_Find_the_Position_of_a_Character_in_a_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==c)
			{
				System.out.println(i);
			}
		}
		
	}

}

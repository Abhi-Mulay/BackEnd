package programOnArray;
/*31. Find the Frequency of a Character in a String
Description: Find how many times a character appears in a string.


Input: "hello", character l


Output: 2*/
import java.util.*;
public class Q31_Find_the_Frequency_Character_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		char ch1[]=s1.toCharArray();
		
		int count=0;
		for (int i = 0; i < ch1.length; i++) {
			if(ch==ch1[i]) {
				count++;
			}
		}
		
		System.out.println("Frequency of a Character is "+count);
	}

}

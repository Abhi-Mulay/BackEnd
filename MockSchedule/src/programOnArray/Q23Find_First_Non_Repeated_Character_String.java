package programOnArray;
/*23. Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.


Input: "swiss"


Output: w*/
import java.util.*;
public class Q23Find_First_Non_Repeated_Character_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			boolean flag=true;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i]==ch[j] && i!=j) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(ch[i]);
				break;
			}	
		}
	}

}

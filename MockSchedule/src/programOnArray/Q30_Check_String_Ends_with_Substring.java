package programOnArray;
/*30. Check if String Ends with a Substring
Description: Check if a string ends with a specific substring.


Input: "hello", substring "lo"


Output: Ends with "lo"*/
import java.util.*;
public class Q30_Check_String_Ends_with_Substring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter the subString string ");
		String s2=sc.nextLine();

		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		int k=0;
		int size = ch1.length-ch2.length;
		for (int i =size ; i < ch1.length; i++) {
			if(ch1[i]==ch2[k]) {
				k++;
			}
		}
		if(k == ch2.length) {
			System.out.println("String is Ends with  "+s2);
		}	
		else {
			System.out.println("Not String is Ends with  "+s2);
		}
	}

}

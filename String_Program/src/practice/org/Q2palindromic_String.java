// Check if a given string is palindromic (same forward and backward).

package practice.org;
import java.util.*;

public class Q2palindromic_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		String s2="";
		
		for(int i=0;i<ch.length;i++)
		{
			s2=ch[i]+s2;
		}
		
		if(s.equals(s2))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}

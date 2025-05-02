package intermediateProgram;
/*10. Find the Longest Palindromic Substring
Description: Write a program to find the longest palindromic substring in a given string.


Input: "babad"


Output: "bab"*/
import java.util.*;
public class Q10_Find_the_Longest_Palindromic_Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		String p1="";
		for (int i = 0; i < ch.length-1; i++) {
			String p2="";
			for (int j = 0; j < ch.length; j++) {
				p2=p2+ch[j];
				p1=p2;
			}
		}
	}

}

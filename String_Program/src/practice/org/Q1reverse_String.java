//1️⃣Write a program to reverse a string without using built-in functions.

package practice.org;
import java.util.*;
public class Q1reverse_String {

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
		
		System.out.println(s2);
		
	}

}

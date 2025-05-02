package oopProgram;
/*Q24. Perform Method overloading using string operation 
void stringOperation(String s): this function can accept string as parameter and sort it
void stringOperation(String first,String second): this function can compare two strings with each other and if strings 
are equal then show message strings are equal otherwise not
void stringOperation(String s,char ch): this function can accept string as parameter and search specific character
in it if character found say character found otherwise show message character not found.

*/

import java.util.*;


public class Q24_Method_overloading_using_string_operation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String first=sc.nextLine();
		
		System.out.println("Enter the another String");
		String second=sc.nextLine();
		
		System.out.println("Enter the character that is present in first String");
		char ch=sc.next().charAt(0);
		
		stringOperation(first);
		
		stringOperation(first,second);
		
		stringOperation(first , ch);
		
	}
	
	public static void stringOperation(String s) {
		StringBuilder s1=new StringBuilder(s);
		String s2=s1.reverse().toString();
		System.out.println("😊String after Reveerse "+s2);
	}
	public static void stringOperation(String first,String second) {
		if(first.equals(second)) {
			System.out.println("😊strings are equal😊");
		}
		else {
			System.out.println("😒String are not equal😒");
		}
	}
	
	public static void stringOperation(String s,char ch) {
		char ch2[]=s.toCharArray();
		boolean flag=false;
		for (int i = 0; i < ch2.length; i++) {
			if(ch2[i]==ch) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("😊Character fount😊");
		}
		else {
			System.out.println("😒Character not found😒");
		}
	}
}

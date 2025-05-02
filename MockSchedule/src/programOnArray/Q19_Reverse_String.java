package programOnArray;
/*19. Reverse a String
Description: Reverse the given string.


Input: "hello"


Output: "olleh"*/
import java.util.*;

public class Q19_Reverse_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1=s;
		char ch[]=s1.toCharArray();
		
		for (int i = 0; i < ch.length/2; i++) {
			char temp=ch[ch.length-1-i];
			ch[ch.length-1-i]=ch[i];
			ch[i]=temp;
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		// with built-in method
		StringBuilder s2=new StringBuilder(s).reverse();	
		System.out.println(s2);
		
	}

}

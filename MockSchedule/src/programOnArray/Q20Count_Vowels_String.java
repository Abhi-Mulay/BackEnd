package programOnArray;
/*20. Count Vowels in String
Description: Count the number of vowels in a given string.


Input: "hello"


Output: 2


*/
import java.util.*;
public class Q20Count_Vowels_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}

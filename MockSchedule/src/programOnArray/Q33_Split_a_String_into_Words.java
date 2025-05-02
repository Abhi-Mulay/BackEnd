package programOnArray;
/*33. Split a String into Words
Description: Split a string into words.


Input: "hello world"


Output: ["hello", "world"]
*/
import java.util.*;
public class Q33_Split_a_String_into_Words {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		
		char ch[]=s1.toCharArray();
		String s="";
		
		String str[]=new String[ch.length];
		int k=0;
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]!=' ') {
				s=s+ch[i];
			}
			if(ch[i]==' ' || i==ch.length-1) {
				str[k++]=s;
				s="";
			}	 
		}
		for (int i = 0; i < k; i++) {
			
		System.out.println(str[i]);
		}
	}

}

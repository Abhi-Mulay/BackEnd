package programOnArray;
/*

22. Count Words in a String
Description: Count the number of words in a string.


Input: "hello world"


Output: 2
*/
import java.util.*;
public class Q22_Count_Words_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int count=0;
		
		char ch[]=s.toCharArray();
		boolean flag=false;
		for (int i = 0; i < ch.length; i++) {
			if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z') || (ch[i]>='0' && ch[i]<='9'))
			{
				if(!flag) {
					count++;
					flag=true;
				}
			}
			else {
				flag=false;
			}
		}
		

		System.out.println(count);
	}

}

//		String str[]=s.split(" ");
	
//		for (int i = 0; i < str.length; i++) {
//			count++;
//		}
		
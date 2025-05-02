package programOnArray;
/*34. Join an Array of Strings into One String
Description: Join an array of strings into a single string.


Input: ["hello", "world"]


Output: "helloworld"*/
import java.util.*;
public class Q34_Join_an_Array_Strings_into_One_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String array element");
		
		String s[]=new String[2];
		
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine();
		}
		
		String str="";
		
		for (int i = 0; i < s.length; i++) {
				str=str+s[i];
		}
		
		System.out.println(str);
	}

}

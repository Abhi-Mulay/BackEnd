//Find the length of the longest word in a given sentence.

package practice.org;
import java.util.*;

public class Q8Longest_Word_In_Sentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		int length=0;
		
		String s1[]=s.split(" ");
		String result="";
		for(int i=0 ;i<s1.length;i++)
		{	
			if(s1[i].length()>result.length())
			{
				result=s1[i];
			}
			
		}
		System.out.println(result);
		
		
	}

}

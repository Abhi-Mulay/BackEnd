//Write a function to check if two strings are anagrams (contain the same letters but in different orders).

package practice.org;
import java.util.*;

public class Q9Anagram_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first the String");
		String s1=sc.nextLine();
		
		System.out.println("Enter Second the String");
		String s2=sc.nextLine();
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int count=0;
		
		if(ch1.length==ch2.length)
		{
			for(int i=0;i<ch1.length;i++)
			{
				
				for(int j=0;j<ch1.length;j++)
				{
					if(ch1[i]<ch1[j])
					{
						char temp1=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp1;
					}
					if(ch2[i]<ch2[j])
					{
						char temp2=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp2;
					}
				}
			}
		for(int i=0 ;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					count++;
				}
			}
			
			if(count==ch1.length)
			{
				System.out.println("String is anagram");
			}
			else {
				System.out.println("String not anagram"+count);
			}
			
		}
		else {
			System.out.println("string Not a anagram ");
		}
		
	}

}

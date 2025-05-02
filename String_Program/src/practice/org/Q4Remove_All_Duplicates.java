//Remove all duplicate characters from a string
package practice.org;
import java.util.*;

public class Q4Remove_All_Duplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		int size=ch.length;
		char ch2[]=new char[size];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				
			}
			if(count<2)
			{
				ch2[k++]=ch[i];
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.print(ch2[i]+" ");
		}
		
		
	}

}

//Q10 Count the occurrence of each character in a string.

package practice.org;
import java.util.*;

public class Q10_Occurence_Of_Charecter {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		boolean b[]=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(!b[i])
			{
				int count=0;
				for(int j=0;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}	
				}
				System.out.println(ch[i]+"  "+count);
			}
		}
		
	}

}

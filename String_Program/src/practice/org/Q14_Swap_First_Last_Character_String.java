//Swap the first and last characters of a string.

package practice.org;
import java.util.*;

public class Q14_Swap_First_Last_Character_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		char c=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			
			if(i==0)
			{
				ch[i]=ch[ch.length-1];
			}
			else if(i==ch.length-1)
			{
				ch[i]=c;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}

//Convert a given string to title case (capitalize first letter of each word).

package practice.org;
import java.util.*;

public class Q5String_First_letter_Capital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		String str[]=s.split(" ");
		String result="";
		for(int i=0;i<str.length;i++)
		{
			char c[]=str[i].toCharArray();
			
			for(int j=0;j<c.length;j++)
			{
				if(c[0]>='a'&&c[0]<='z')
				{
					c[j]=(char)(c[j]-32);
					
				}
//				System.out.println(result);
				result=result+c[j];
			}
			
			if(i<str.length-1)
			{
				result=result+" ";
			}
			else {
				result=result;
			}
		}
		System.out.println(result);
	}

}

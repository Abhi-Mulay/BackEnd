//Check if a string contains only digits
package practice.org;
import java.util.*;

public class Q12Check_String_Contain_Only_Digit {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				count++;
			}
		}
		
		if(ch.length==count)
		{
			System.out.println("string contains only digits");
		}
		else {
			System.out.println("string not contains only digits");
		}
	}

}

package loop.org.test;
import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String s=sc.nextLine();
		
		System.out.println("Enter the second String");
		String t=sc.nextLine();
		
		char c1[]=s.toCharArray();
		char c2[]=t.toCharArray();
		
		int count=0;
		
		
		for(int i=0 ;i<c1.length ;i++)
		{
			for(int j=0;j<c1.length ;j++)
			{
				if(c1[i]==c1[j])
				{
					count++;
				}
			}
		}
		
		
	}

}

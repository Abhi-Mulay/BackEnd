// Remove all white spaces from a string
package practice.org;
import java.util.*;

public class Q11Remove_Space {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		// 1 logic
		char ch[]=s.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				s1+=ch[i];
			}
		}
		System.out.println(s1);
//		int count=0;
//		
//		for(int i=0 ;i<ch.length;i++)
//		{
//				for(int j=i+1;j<ch.length;j++)
//				{
//					if(ch[i]==' ')
//					{
//						char temp=ch[i];
//						ch[i]=ch[j];
//						ch[j]=temp;
//						
//					}
//				}
//				if(ch[i]==' ') {
//					count++;
//				}
//			
//		}
//		String s1="";
//		for(int i=0;i<ch.length-count;i++)
//		{
//			s1=s1+ch[i];
//		}
//		System.out.println(s1);
		
		
		//2 logic
//		String s1[]=s.split(" ");
//		String s2="";
//		for(int i=0;i<s1.length;i++)
//		{			
//				s2=s2+s1[i];
//		}
//		System.out.println(s2);
	}
}
     //java is fun
    //javaisfun


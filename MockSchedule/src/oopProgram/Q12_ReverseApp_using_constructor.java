package oopProgram;
/*Q12. Write a java program to create class name ReverseApp using constructor name as :

	ReverseApp(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	ReverseApp(String )
	{
		//  perform string reverse logic.
	}
*/
import java.util.*;
class ReverseApp
{
	ReverseApp(int [ ]a)
	{
		for (int i = 0; i < a.length/2; i++) {
			int temp=a[a.length-1-i];
			a[a.length-1-i]=a[i];
			a[i]=temp;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	ReverseApp(String s)
	{
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length/2; i++) {
			char  temp=ch[ch.length-1-i];
			ch[ch.length-1-i]=ch[i];
			ch[i]=temp;
		}
		String str="";
		for (int i = 0; i < ch.length; i++) {
			str+=ch[i];
		}
		System.out.println(str);
	}
}
public class Q12_ReverseApp_using_constructor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements in array");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the String");
		sc.nextLine();
		String s=sc.nextLine();
		
		ReverseApp r1 = new ReverseApp(a);
		
		ReverseApp r2 = new ReverseApp(s);
		
	}

}

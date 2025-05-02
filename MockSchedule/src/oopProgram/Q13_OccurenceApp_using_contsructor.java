package oopProgram;
/*Q13. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}
*/
import java.util.*;
class OccurenceApp
{
	
	OccurenceApp(int []a){
		System.out.println("Event Numbers:");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
	OccurenceApp(char []ch){
		int vowel=0;
		int consonent=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u'|| ch[i]=='A' || ch[i]=='E'|| ch[i]=='I' || ch[i]=='O'|| ch[i]=='U') {
				vowel++;
			}
			else if((ch[i]>=65 && ch[i]<=90)||(ch[i]>=97 && ch[i]<=122)) 
			{
				consonent++;
			}
		}
		
		System.out.println("Vowels "+vowel);
		System.out.println("Consonent "+consonent);
	}
}
public class Q13_OccurenceApp_using_contsructor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of integer array");
		int size1=sc.nextInt();
		
		int a[]=new int[size1];
		System.out.println("Enter the elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of character array");
		int size2=sc.nextInt();
	
		char ch[]=new char[size2];
		System.out.println("Enter the characters");
		
		for (int i = 0; i < ch.length; i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		OccurenceApp o1=new OccurenceApp(a);
		OccurenceApp o2=new OccurenceApp(ch);
	}

}

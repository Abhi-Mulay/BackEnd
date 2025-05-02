//Count the number of vowels and consonants in a string.
package practice.org;
import java.util.*;

public class Q3Count_Vowel_Consonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		int vowel=0;
		int consonant=0;
		int space=0;
		
		for(int i=0;i<ch.length;i++)
		{
			
				
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					vowel++;
				}
				else if(ch[i]==' '){
					continue;
				}
				else {
					consonant++;
				}
			
		}
		
		System.out.println("Vowels are in string: "+vowel);
		System.out.println("consonants in string: "+(consonant));
	}

}

package oopProgram;
import java.util.*;
interface stringTemplate
{
	void setString(String s);
	public int getResult();
	void displayResult();
}
class Extract implements stringTemplate{
	int sum=0;
	public void setString(String s) {
		char ch[]=s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				sum=sum+(ch[i]-48);
			}
		}
	}
	public int getResult() 
	{
		return sum;
	}
	
	public 	void displayResult() {
		System.out.println("Sum of digit "+getResult());
	}
} 
class countVowel implements stringTemplate{
	int vowel=0;
	public void setString(String s) {
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U' ||ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				vowel++;
			}
		}
	}
	public int getResult() 
	{
		return vowel;
	}
	
	public 	void displayResult() {
		System.out.println("Count of Vowels "+getResult());
	}
} 
class StringHelper 
{
	public void performOperation(stringTemplate st , String s) {
		
		st.setString(s);
		st.displayResult();
	}
}
public class Q20String_Handling {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		StringHelper helper = new StringHelper();

		helper.performOperation(new Extract(),s);
		helper.performOperation(new countVowel(),s);
	}
}

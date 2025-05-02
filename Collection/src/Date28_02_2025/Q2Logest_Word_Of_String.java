//Q2. WAP to input string from keyboard and find the longest word from string
//
//Example: Good Morning India 
//Output: morning 

package Date28_02_2025;
import java.util.*;

public class Q2Logest_Word_Of_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		String s1[]=s.split(" ");
		
		HashMap <String,Integer> map=new HashMap();
		
		String find="";
		for(String s2:s1)
		{
			map.put(s2,s2.length());
			if(s2.length()>find.length())
			{
				find=s2;
			}
		}
		//  for single longest word or first longest word
	   //	System.out.println(find+"\t"+find.length());
		
		//for multiple longest word in string 
		for(Map.Entry<String , Integer> mm :map.entrySet())
		{
			if(mm.getValue().equals(find.length()))
			{
				System.out.println(mm.getKey()+"   "+mm.getValue());
			}
		}
	}

}

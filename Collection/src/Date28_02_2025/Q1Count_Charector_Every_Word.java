//Q1. WAP to input string and count the number of character in every word
//Example: Good Morning India 
//Output:
//Good   4
//Morning : 7
//India : 5

package Date28_02_2025;
import java.util.*;

public class Q1Count_Charector_Every_Word {
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String word[]=s.split(" ");
		
		for(String m : word)
		{
			
			map.put(m,m.length());
			
		}
		
		for(Map.Entry<String , Integer> mm :map.entrySet())
		{
			System.out.println(mm.getKey()+""+mm.getValue());
		}
		
	}
	
}

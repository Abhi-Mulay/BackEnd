/*Q2. WAP to store 10 string values in Vector and search string whose length is more than three and ends with sh */
package Assignment;
import java.util.*;
public class Q7_Search_String_length_Ends_with {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of vector");
		int size=sc.nextInt();
		Vector v= new Vector();
		System.out.println("Enter the String values in vector");
		
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextLine());
		}
		for(int i=0;i<v.size();i++)
		{
			String s=(String)v.get(i);
			if(s.length()>3 && s.endsWith("sh"))
			{
				System.out.println(v.get(i));
			}
		}
		
	}
}

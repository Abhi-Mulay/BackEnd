/*Q3. WAP to store 10 string values in Vector and count the total number voles in all strings of Vector?*/
package Assignment;
import java.util.*;
public class Q8_Count_Vowel_in_All_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of vector");
		int size=sc.nextInt();
		sc.nextLine();
		Vector v = new Vector();
		System.out.println("Enter the "+size+" Strings in vector");
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextLine());
		}
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		int count=0;
		for(int i=0;i<v.size();i++)
		{
			String s=(String)v.get(i);
			s=s.toLowerCase();
			char c[]=s.toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u')
				{
					count++;
				}
			}
		}
		System.out.println("vowels in vector strings "+count);
	}

}

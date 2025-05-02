/*Q4. WAP to store 10 values in Vector and find the unique values from vector?*/
package Assignment;
import java.util.*;
public class Q10_Unique_Values_In_Vector {

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
		
		for(int i=0; i<v.size();i++)
		{
			int count=0;
		}

	}

}

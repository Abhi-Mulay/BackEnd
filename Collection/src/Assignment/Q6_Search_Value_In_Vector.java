/*Q1. WAP to store 5 values in Vector and search value present in vector without using any inbuilt methods 
like as contains() or indexOf() 
Note: we can use get() method */
package Assignment;
import java.util.*;
public class Q6_Search_Value_In_Vector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sized of Vector");
		int size=sc.nextInt();
		Vector v = new Vector();
		System.out.println("Enter the values in Vector");
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		System.out.println("Enter the number to be search");
		int search=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<v.size();i++)
		{
			if(search==(int)v.get(i))
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("Value is present");
		}
		else {
			System.out.println("Value not present");
		}
	}

}

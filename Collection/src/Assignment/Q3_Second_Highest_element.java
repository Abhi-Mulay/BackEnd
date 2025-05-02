package Assignment;

import java.util.*;

/*Q3. WAP to find the second highest element from a vector?*/
public class Q3_Second_Highest_element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of vector");
		int size = sc.nextInt();
		Vector v=new Vector(size);
		System.out.println("Enter the valuse");
		for(int i=0;i<size;i++)
		{
			int n=sc.nextInt();
			v.add(n);
		}
		int highest=(int)v.get(0);
		int Secondhighest=(int)v.get(1);
		
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)>highest)
			{
				Secondhighest=highest;
				highest=(int)v.get(i);			}
			else if((int)v.get(i)> Secondhighest && (int)v.get(i)<highest)
			{
				Secondhighest=(int)v.get(i);
			}
		}
		System.out.print(Secondhighest);
		
	}

}

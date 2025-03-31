package array_23_02_2025;
import java.util.*;

public class Q7_Leaders_Array_Elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0 ; i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<a.length-1; i++)
		{
			int count=0;
			for(int j=i+1 ; j<a.length ;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println(a[j]);
					count++;
				}
			}
			if(count>=1)
			{
				System.out.println("------------->"+a[i]);
			}
		}
		
	}

}

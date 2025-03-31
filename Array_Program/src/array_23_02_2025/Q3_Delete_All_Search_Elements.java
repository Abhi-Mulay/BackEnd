package array_23_02_2025;
import java.util.*;

public class Q3_Delete_All_Search_Elements {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0 ; i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to be delete");
		int n=sc.nextInt();
		
		int b[]=new int[size];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=n)
			{
				b[k++]=a[i];
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("length"+b.length);
		
	}

}

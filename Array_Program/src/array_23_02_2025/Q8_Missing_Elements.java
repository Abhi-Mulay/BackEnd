package array_23_02_2025;
import java.util.*;

public class Q8_Missing_Elements {

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
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=0 ; j<a.length ;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Missing elements");
		for(int i=0 ;i <a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(j+" ");
			}
		}
	}

}

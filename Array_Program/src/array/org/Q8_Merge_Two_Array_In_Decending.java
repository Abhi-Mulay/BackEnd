package array.org;
import java.util.*;

public class Q8_Merge_Two_Array_In_Decending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		System.out.println("Enter the first array element");
		int a[] = new int[size];
		
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the second array element");
		int b[] = new int[size];
		
		for(int i=0 ; i<b.length ; i++)
		{
			b[i]=sc.nextInt();
		}
		
		int c[] = new int[a.length+b.length];
		int k=0;
		
		
		
		
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		
		for(int j=0 ; j<b.length ; j++)
		{
			c[k++]=b[j];
		}
		
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		for(int i=0 ; i<k;i++)
		{
			System.out.println(c[i]);
		}
		
	}

}

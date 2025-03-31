package array.org;
import java.util.*;

public class Q23_Move_Zero_To_End {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<a.length ;i++)
		{
			for(int j=i+1 ;j<a.length ;j++)
			{
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0 ; i<a.length ;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		
	}

}
// 10
// 2 5 7 0 4 0 7 -5 8 0

package array_23_02_2025;
import java.util.*;

public class Q5_Left_Rotate {

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
		
		System.out.println("Enter the position to rotate");
		int n=sc.nextInt();
		
		for(int i=0 ;i <n;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		for(int i=0;i<a.length ;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}

package array.org;
import java.util.*;

public class Q22_Maximmum_Circular_Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the values in array");
		
		for(int i=0; i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length ;j++)
			{
				sum=a[i]+a[j];
			}
			System.out.println(sum);
		}
		
		
	}

}
//   10 8 -20 5 -3 -5 10 -13 11
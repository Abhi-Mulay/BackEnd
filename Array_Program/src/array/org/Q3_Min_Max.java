package array.org;
import java.util.*;

public class Q3_Min_Max {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		
		int max=a.length;
		
		for(int i=0 ; i<a.length ;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min ) {
				min=a[i];
			}
		}
		
		System.out.println("min "+min);
		
		System.out.println("max "+max);
		
	}

}

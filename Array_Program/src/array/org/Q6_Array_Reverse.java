package array.org;
import java.util.*;

public class Q6_Array_Reverse {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[] = new int[size];
		
		for(int i=0; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int mid=a.length/2;
		int end=a.length-1;
		
		for(int i=0 ; i<mid ; i++)
		{
			int temp=a[end];
			a[end]=a[i];
			a[i]=temp;
			end--;
			
		}	
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}

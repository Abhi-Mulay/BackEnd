package array.org;
import java.util.*;

public class Q10_Delete_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int a[] = new int[size];
		
		for(int i=0 ; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to be delete");
		int n=sc.nextInt();
		
		for(int i=n-1;i<a.length-1; i++)
		{
			a[i] = a[i+1]; 
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}

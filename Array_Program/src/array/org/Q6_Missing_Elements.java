package array.org;
import java.util.*;

public class Q6_Missing_Elements {

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
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1 ; j<a[i+1];j++)
			{
				System.out.println(j);
			}
		}
		
	}

}

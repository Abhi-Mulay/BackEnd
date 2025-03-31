package array.org;
import java.util.*;

public class Q11_Second_Largest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[]=new int[size];
		
		for(int i=0 ; i < a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int first=a[0];
		int second=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			
			else if(second <a[i] && first<a[i])
			{
				second = a[i];
			}
		}
		
		System.out.println("Second largest element "+second);
	}

}

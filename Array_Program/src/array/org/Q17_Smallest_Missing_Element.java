package array.org;
import java.util.*;

public class Q17_Smallest_Missing_Element {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		
		for(int i=0; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=0;j<a.length ; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		int smallest=0;
		
		for(int i=0;i<a.length ; i++)
		{
			for(int j=a[i]+1; j<a[i+1] ;i++)
			{
				smallest=j;
				break;
			}
			break;
		}
		
		if(smallest>0)
		{
			System.out.println("Smallest element is  "+smallest);
		}
		else {
			System.out.println("No Missing element present");
		}
		
	}

}

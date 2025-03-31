package array_23_02_2025;
import java.util.*;


public class Q10_Second_Smallest_Missing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0 ;i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length ;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int missingCount=0;
		int SecondMissing=-1;
		for(int i=0;i<a.length-1 ;i++)
		{
			
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				missingCount++;
				if(missingCount==2)
				{
					SecondMissing=j;
					break;
				}
				
			}
			if(SecondMissing!=-1)
			{
				break;
			}
			
		}
		
		if(SecondMissing!=-1)
		{
			System.out.println("Second missing element is "+SecondMissing);
		}
		else {
			System.out.println("Not having any missing elements");
		}
		
	}

}

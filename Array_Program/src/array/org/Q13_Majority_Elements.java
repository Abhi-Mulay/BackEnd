package array.org;
import java.util.*;

public class Q13_Majority_Elements {

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
		
		int maj=a.length/2;
		int flag=1;
		for(int i=0 ; i<a.length ; i++)
		{
			int count=0;
			for(int j=0;j<a.length ; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count>maj)
			{
				System.out.println("Majority number is "+a[i]);
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==0)
		{
			System.out.println("No Majority element found😭😭😭😭😭😭");
		}
		
	}

}

package array.org;
import java.util.*;

public class Q21_Appears_More_N_Half {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int mid=a.length/2;
		int flag=0;
		for(int i=0;i<a.length ; i++)
		{
			int count=0;
			for(int j=0 ; j<a.length ; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>=mid)
			{
				System.out.println(a[i]+" appears more than "+count+" times in the given array[]");
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("Not any number appears more than "+mid+" times in the given");
		}
		
		
	}

}

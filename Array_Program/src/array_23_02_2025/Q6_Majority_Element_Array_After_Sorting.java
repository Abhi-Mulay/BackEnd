package array_23_02_2025;
import java.util.*;

public class Q6_Majority_Element_Array_After_Sorting {

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
		
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=0 ; j<a.length ;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int flag=0;
		for(int i=0 ;i<a.length ;i++)
		{
			int count=0;
			for(int j=0 ;j<a.length ;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>a.length/2)
			{
				System.out.println("Majority elements "+a[i]);
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("No magority elements founds");
		}
	}

}

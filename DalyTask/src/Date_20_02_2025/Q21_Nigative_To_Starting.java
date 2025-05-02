//Move all negative numbers to the beginning
//Rearrange the array such that all negative numbers are moved to the front.

package Date_20_02_2025;
import java.util.*;

public class Q21_Nigative_To_Starting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elements");
		
		for(int i=0 ;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					j++;
				}
			
		}
		
		for(int num:a)
		{
			System.out.print(num+" ");
		}
	}

}

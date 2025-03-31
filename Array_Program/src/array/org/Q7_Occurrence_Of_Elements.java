package array.org;
import java.util.*;

public class Q7_Occurrence_Of_Elements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[]= new int[size];
		
		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		
		boolean b[]=new boolean[size];
		
		for(int i=0;i<size;i++)
		{
			int count=0;
			if(!b[i])
			{
				
				for(int j=0 ; j<a.length ; j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+"----->"+count);
				
			}
		}
		
	}

}

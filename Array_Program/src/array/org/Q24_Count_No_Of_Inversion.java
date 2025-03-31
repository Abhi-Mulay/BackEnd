package array.org;
import java.util.*;

public class Q24_Count_No_Of_Inversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elemenets");
		
		for(int i=0;i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1 ;i <a.length ; i++)
		{
			
			
				for(int j=i+1;j<a.length ;j++)
				{
						if(a[i]>a[j])
						{
							System.out.println("["+a[i]+","+a[j]+"]");
							count++;
							
						}
					
				}
			
			
		}
		
		System.out.println("------------------------------\n\n"+count);
		
	}

}

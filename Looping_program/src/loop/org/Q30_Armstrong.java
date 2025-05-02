package loop.org;
import java.util.*;
public class Q30_Armstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
	
		int sum=0;
		
		int count=0;
		
		int temp=n;
		
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		temp=n;
		
		while(temp!=0)
		{
			int digit=temp%10;
			
			int fact=1;
			
			for(int i=1; i <=count; i++)
			{
				fact=fact*digit;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("Armstromg");
		}
		else {
			System.out.println("not Armstrong");
		}
		
		
		
	}

}

package loop.org;
import java.util.*;

public class Q35_Strong_1_To_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		System.out.println("All Strong number from 1 to n");
		
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			int rem=0;
			int sum=0;
			while(temp!=0)
			{
				rem=temp%10;
				int mul=1;
				
				while(rem!=0)
				{
					mul*=rem;
					rem--;
				}
				
				sum=sum+mul;
				
				temp/=10;
				
			}
			
			if(sum==i)
			{
				System.out.println(i);
			}
				
		}
		
		
	}

}

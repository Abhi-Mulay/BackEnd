package loop.org;
import java.util.*;

public class Q28_Sum_Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j = 1;j<=i;j++)
			{
				if(i % j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
	}

}

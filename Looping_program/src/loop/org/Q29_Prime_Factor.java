package loop.org;
import java.util.*;

public class Q29_Prime_Factor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i = 1 ; i <= n ; i++)
		{
			int count=0;
			if(n%i==0)
			{
				for(int j= 1 ; j<=i ; j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i);
				}
			}
			
		}
			
	}

}

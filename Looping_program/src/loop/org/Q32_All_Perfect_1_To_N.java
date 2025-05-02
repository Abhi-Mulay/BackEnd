package loop.org;
import java.util.*;

public class Q32_All_Perfect_1_To_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		
		for(int i=1; i<=n ; i++)
		{
			int sum=0;
			int temp=i;
			for(int j=1;j<=i/2 ; j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(sum==temp)
			{
				System.out.println(sum);
			}
		}
		
		
	}

}

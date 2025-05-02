package loop.org;
import java.util.*;

public class Q31_Perfact_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		
		for(int i=1 ;i <=n /2; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==temp)
		{
			System.out.println("Perfact Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		
	}

}

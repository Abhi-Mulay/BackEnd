package loop.org;
import java.util.*;
public class Q26_Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("NUmber is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
		
	}

}

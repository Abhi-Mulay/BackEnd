package loop.org;
import java.util.*;

public class Q14_Sum_Of_Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		
		System.out.println("sum of digit "+sum);

	}

}

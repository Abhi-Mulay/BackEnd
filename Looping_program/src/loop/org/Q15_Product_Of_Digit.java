package loop.org;
import java.util.*;
public class Q15_Product_Of_Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=1;
		int rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum*=rem;
			n/=10;
		}
		
		System.out.println("product of number"+sum);
		
	}

}

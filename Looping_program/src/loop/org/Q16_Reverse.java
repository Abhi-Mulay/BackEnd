package loop.org;
import java.util.*;
public class Q16_Reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int rem=0;
		int rev=0;
		
		int temp=n;
		int count=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		System.out.println(rev);

	}

}

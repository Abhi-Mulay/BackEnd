package loop.org;
import java.util.*;

public class Q36_Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(a);
			
			a=b;
			b=c;
			
		}
		
	}

}

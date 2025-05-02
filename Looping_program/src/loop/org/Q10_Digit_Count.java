package loop.org;
import java.util.*;
public class Q10_Digit_Count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int rem=0;
		int count=0;
		
		while(n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println(count);

	}

}

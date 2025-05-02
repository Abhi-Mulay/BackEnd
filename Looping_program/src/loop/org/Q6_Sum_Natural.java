package loop.org;
import java.util.*;
public class Q6_Sum_Natural {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i!=n)
		{
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
	}

}

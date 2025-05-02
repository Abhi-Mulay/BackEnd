package loop.org;
import java.util.*;

public class Q25_LCM {

	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		int lcm=0;
		
		for(int i=1;i<=n1;i++)
		{
			if(n1*i == n2*i)
			{
				lcm=i;
				break;
			}
		}
		
		System.out.println(lcm);
		
	}

}

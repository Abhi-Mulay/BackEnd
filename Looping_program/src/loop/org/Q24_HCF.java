package loop.org;
import java.util.*;
public class Q24_HCF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int hcf=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		
		System.out.println(hcf);
	}

}

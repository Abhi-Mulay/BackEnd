package loop.org;
import java.util.*;
public class Q22_Factor_Of_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		
	}

}

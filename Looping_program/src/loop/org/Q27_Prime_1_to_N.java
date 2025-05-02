package loop.org;
import java.util.*;
public class Q27_Prime_1_to_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the nuber");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}

package loop.org;
import java.util.*;
public class Q8_Sum_Odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		
		while(i!=n)
		{
			if(i%2!=0)
			{
				sum+=i;
			}	
			i++;
		}
		System.out.println(sum);

	}

}

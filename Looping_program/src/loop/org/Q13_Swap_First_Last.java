package loop.org;
import java.util.*;

public class Q13_Swap_First_Last {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		int count=0;
		int temp=n;
		
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		int k=1;
		for(int i=1 ; i<count;i++)
		{
			k*=10;
		}
		int mid=(n%k)/10;
		
		int first = n/k;
		int last = n%10;
		int swap=(last*k)+(mid*10)+first;
		
		System.out.println(swap);
		

	}

}

package loop.org;
import java.util.*;

public class Q33_Strong_No {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int rem=0;
		int temp=n;
		int sum=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			int mul=1;
			
			while(rem!=0)
			{
				mul=mul*rem;//1*1   1*4 4*3 12*2 24*1
				rem--;
			}
			
			sum=sum+mul;
			
			temp/=10;
			
		}
		
		if(sum == n)
		{
			System.out.println("Strong number "+n);
		}
		else {
			System.out.println("Not a Strong number "+n);
		}
		
	}

}

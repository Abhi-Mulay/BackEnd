package loop.org;
import java.util.*;
public class Q11_First_Last {

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
		temp=n;
		int k=1;
		for(int i=1;i<count;i++)
		{
			k=k*10;
		}
		int first=temp/k;
		int last=temp%10;
		
		System.out.println("First no "+first);
		System.out.println("Last no "+last);

	}

}

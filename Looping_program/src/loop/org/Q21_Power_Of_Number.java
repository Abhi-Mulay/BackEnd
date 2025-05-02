package loop.org;
import java.util.*;
public class Q21_Power_Of_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		System.out.println("Enter the index");
		int index=sc.nextInt();
		
		int mul=1;
		for(int i=1;i<=index;i++)
		{
			mul*=n;
		}
		
		System.out.println(mul);
		
		
	}

}

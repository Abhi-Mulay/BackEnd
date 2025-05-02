package loop.org;
import java.util.*;
public class Q4_Even_1_To_N {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int i=1;
		
		while(i!=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}

}

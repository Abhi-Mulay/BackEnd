package loop.org;
import java.util.*;
public class Q9_Multiplication_Table {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int mul=1;
		int sum=0;
		while(mul<=10)
		{
			sum=mul*n;
			System.out.println(sum);
			mul++;
		}
	}

}

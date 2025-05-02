package loopingProgram;
/*13. Check for Prime Number
Description: Write a program to check if a number n is prime.
Input: n = 7


Output: Prime


*/
import java.util.*;

public class Q13_Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("not a prime number");
		}
		
	}

}

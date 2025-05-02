package loopingProgram;
/*2. Factorial of a Number
Description: Write a program to compute the factorial of a given number n.
Input: n = 4


Output: 24
*/
import java.util.*;

public class Q2_Factorial_Of_Number {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul*=i;
		}
		
		System.out.println("Factorial of number: "+mul);

	}

}

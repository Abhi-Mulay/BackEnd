package loopingProgram;
/*42. Find the Factorial Using While Loop
Description: Write a program to calculate the factorial of a number using a while loop.
Input: n = 5


Output: 120
*/
import java.util.*;
public class Q42_Find_the_Factorial_Using_While_Loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul*=i;
		}
		
		System.out.println("Factorial of number: "+mul);

	}

}

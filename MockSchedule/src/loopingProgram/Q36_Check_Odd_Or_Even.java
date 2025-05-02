package loopingProgram;
/*36. Check for Odd or Even
Description: Write a program to check whether a given number is odd or even.
Input: n = 4


Output: Even


*/
import java.util.*;
public class Q36_Check_Odd_Or_Even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

}

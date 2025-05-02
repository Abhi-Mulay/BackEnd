package loopingProgram;
/*50. Find Greatest Common Divisor (GCD)
Description: Write a program to find the greatest common divisor (GCD) of two numbers.
Input: a = 12, b = 15


Output: 3


*/
import java.util.Scanner;

public class Q50_Find_Greatest_Common_DivisorGCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int count=0;
		for(int i=2; i<=a;i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
}

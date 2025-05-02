package loopingProgram;
/*9. Sum of Digits
Description: Write a program to calculate the sum of digits of a given number.
Input: n = 234


Output: 9*/

import java.util.*;
public class Q9Sum_Of_Digit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		
		System.out.println("Sum of all digit "+sum);
	}

}

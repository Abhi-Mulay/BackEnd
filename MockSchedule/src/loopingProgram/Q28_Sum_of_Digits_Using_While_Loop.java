package loopingProgram;
/*28. Sum of Digits Using While Loop
Description: Write a program to calculate the sum of digits using a while loop.
Input: n = 123


Output: 6*/
import java.util.*;
public class Q28_Sum_of_Digits_Using_While_Loop {

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
		
		System.out.println(sum);
	}

}

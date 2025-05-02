package loopingProgram;
/*30. Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6


Output: Perfect


*/
import java.util.*;
public class Q30_Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++) {
			
				if(n%i==0) {
					sum+=i;
				}
			
		}
		
		if(n==sum) {
			System.out.println("Number is perfect number "+sum);
		}
		else {
			System.out.println("Number is not perfect number");
		}
	}

}

package loopingProgram;
/*6. Armstrong Number
Description: Write a program to check if a number is an Armstrong number.
Input: n = 153


Output: Armstrong


*/
import java.util.*;
public class Q6Armstrong_Number {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		int temp=n;
		int count=0;
		int sum=0;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		temp=n;
		while(temp!=0) {
			int rem=temp%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
				mul=mul*rem;
			}
			sum+=mul;
			temp/=10;
		}
		
		if(sum == n) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
		
	}

}

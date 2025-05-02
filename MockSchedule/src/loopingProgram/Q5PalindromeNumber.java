package loopingProgram;
/*5. Palindrome Number
Description: Write a program to check if a number is a palindrome.
Input: n = 121


Output: Palindrome
*/
import java.util.*;
public class Q5PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int rem=0,rev=0;
		int temp=n;
		
		int count=0;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(n == rev) {

			System.out.println("Number is Palindrome: "+n);
			
		}
		else {
			
			System.out.println("Number is Not Palindrome: "+n);
			
		}
	}

}

package loopingProgram;
/*25. Find the Second Largest Number
Description: Write a program to find the second largest number from a set of two numbers.
Input: a = 10, b = 20


Output: 10


*/
import java.util.*;
public class Q25_Find_Second_Larget_Number {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a<b) {
			System.out.println("A is second Largest");
		}
		else if(b<a) {
			System.out.println("B is second Largest");
		}
		else{
			System.out.println("Both are same");
		}
		
	}

}

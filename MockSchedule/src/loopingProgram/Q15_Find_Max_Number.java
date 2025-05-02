package loopingProgram;
/*15. Find Maximum Number
Description: Write a program to find the maximum number between two numbers.
Input: a = 10, b = 20


Output: 20
*/
import java.util.*;

public class Q15_Find_Max_Number {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("A is Max");
		}
		else if(b>a) {
			System.out.println("B is Max");
		}
		else{
			System.out.println("Both are same");
		}
	}

}

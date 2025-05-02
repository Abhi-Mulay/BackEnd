package loopingProgram;
/*33. Print Square of a Number
Description: Write a program to print the square of a number.
Input: n = 4


Output: 16


*/
import java.util.*;
public class Q33_Print_Square_of_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int mul=n*n;
		
		System.out.println("The square of Numbers:  "+mul);

	}

}

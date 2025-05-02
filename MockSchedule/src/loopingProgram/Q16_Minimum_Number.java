package loopingProgram;

import java.util.Scanner;

/*16. Find Minimum Number
Description: Write a program to find the minimum number between two numbers.
Input: a = 10, b = 20


Output: 10
*/

import java.util.*;

public class Q16_Minimum_Number {

	public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		if(a<b) {
			System.out.println("A is Min");
		}
		else if(b<a) {
			System.out.println("B is Min");
		}
		else{
			System.out.println("Both are same");
		}
	}

}

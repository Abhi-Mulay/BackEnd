package loopingProgram;

//1. Sum of Numbers
//Description: Write a program to calculate the sum of numbers from 1 to n.
//Input: n = 5
//
//
//Output: 15
//

import java.util.*;
public class Q1Sum_Of_Number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println("Sum of all number : "+sum);
		
	}

}

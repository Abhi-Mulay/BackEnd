package loopingProgram;

import java.util.Scanner;

/*27. Sum of All Numbers in a Range
Description: Write a program to calculate the sum of all numbers between m and n.
Input: m = 1, n = 5


Output: 15
*/
public class Q27_Sum_of_All_Numbers_In_a_Range {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		int sum=0;
		if(a<b) {
			for(int i=a;i<=b;i++) {
				sum+=i;
			}
			System.out.println(sum);
		}
		else {
			System.out.println("Second number should be greater then first");
		}
	}

}

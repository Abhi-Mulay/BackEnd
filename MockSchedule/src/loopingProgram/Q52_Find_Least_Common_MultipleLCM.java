package loopingProgram;
/*52. Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.
Input: a = 12, b = 15


Output: 60*/
import java.util.Scanner;
public class Q52_Find_Least_Common_MultipleLCM {

	
	    public static void main(String[] args) {

	    	Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number");
			int a=sc.nextInt();
			
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			
	        int max = Math.max(a, b); 
	        while (true) {
	            if (max % a == 0 && max % b == 0) {
	                System.out.println("LCM of " + a + " and " + b + " is: " + max);
	                break; 
	            }
	            max++; 
	        }
	    }
}

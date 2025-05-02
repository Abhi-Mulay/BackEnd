package loopingProgram;
/*10. Count Digits
Description: Write a program to count the number of digits in a number n.
Input: n = 12345


Output: 5
*/
import java.util.*;
public class Q10_Count_Of_Digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int count=0;
		
		while(n!=0) {
			n/=10;
			count++;
		}
		
		System.out.println("Sum of all digit "+count);
	}

}

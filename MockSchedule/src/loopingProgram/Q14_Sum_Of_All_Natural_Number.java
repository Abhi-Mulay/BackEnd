package loopingProgram;
/*14. Sum of Natural Numbers
Description: Write a program to find the sum of the first n natural numbers.
Input: n = 5


Output: 15


*/
import java.util.Scanner;

public class Q14_Sum_Of_All_Natural_Number {

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

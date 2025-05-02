package loopingProgram;
/*34. Find Sum of All Odd Numbers in a Range
Description: Write a program to find the sum of all odd numbers in a range from m to n.
Input: m = 1, n = 10


Output: 25
*/
import java.util.*;
public class Q34_Sum_Of_All_Odd_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}

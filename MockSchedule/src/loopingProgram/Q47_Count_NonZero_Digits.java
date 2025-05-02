package loopingProgram;
/*47. Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203


Output: 3


*/
import java.util.*;
public class Q47_Count_NonZero_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int count=0;
		
		while(n!=0) {
			int rem=n%10;
			if(rem!=0) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
	}

}

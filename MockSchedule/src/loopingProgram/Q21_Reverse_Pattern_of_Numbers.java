package loopingProgram;
/*21. Reverse Pattern of Numbers
Description: Write a program to print numbers in reverse order.
Input: n = 5


Output:
 5 4 3 2 1
*/
import java.util.*;
public class Q21_Reverse_Pattern_of_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		for(int i=1;i<=n;i++) {
			System.out.print(temp+" ");
			temp--;
		}
	}

}

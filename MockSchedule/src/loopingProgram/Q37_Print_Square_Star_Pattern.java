package loopingProgram;
/*37. Print Square Star Pattern
Description: Write a program to print a square pattern using stars.
Input: n = 4


Output:

 markdown
Copy
****
****
****
****
*/
import java.util.*;
public class Q37_Print_Square_Star_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

package loopingProgram;
/*22. Print Triangle of Stars
Description: Write a program to print a triangle of stars.
Input: n = 4


Output:
*
**
***
****
*/
import java.util.*;

public class Q22_Print_Triangle_Of_Stars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package loopingProgram;
/*44. Print Star Pyramid
Description: Write a program to print a pyramid using stars.
Input: n = 5
Output:

    *
   ***
  *****
 *******
*********
*/
import java.util.*;

public class Q44_Print_Star_Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2;j++) {
				if(j<n+i && j>n-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

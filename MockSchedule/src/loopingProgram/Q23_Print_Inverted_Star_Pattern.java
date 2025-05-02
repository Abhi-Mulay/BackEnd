package loopingProgram;
/*23. Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4


Output:
****
***
**
*
*/
import java.util.*;
public class Q23_Print_Inverted_Star_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
	}

}

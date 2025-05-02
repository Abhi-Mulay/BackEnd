package loopingProgram;
/*35. Print Right-Angled Triangle Pattern of Numbers
Description: Write a program to print a right-angled triangle of numbers.
Input: n = 4


Output:

1
12
123
1234
*/
import java.util.*;
public class Q35_Print_RightAngled_Triangle_Pattern_Of_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

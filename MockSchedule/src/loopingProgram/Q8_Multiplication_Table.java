package loopingProgram;
/*8. Multiplication Table
Description: Write a program to print the multiplication table for a number n.
Input: n = 4


Output: 4 8 12 16 20
*/
import java.util.*;
public class Q8_Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" x "+i+" = "+i*n);
		}
		
	}

}

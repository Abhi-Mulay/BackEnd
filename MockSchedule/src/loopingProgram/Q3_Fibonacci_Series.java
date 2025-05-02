package loopingProgram;
/*3. Fibonacci Series
Description: Write a program to print the first n Fibonacci numbers.
Input: n = 5


Output: 0 1 1 2 3


*/
import java.util.*;
public class Q3_Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int a=0, b=1,c;
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}

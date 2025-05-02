package loopingProgram;
/*31. Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3


Output: 36
*/
import java.util.*;
public class Q31Sum_Cubes_First_N_Natural_Numbers {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(i*i*i);
			count++;
			if(count==n) {
				break;
			}
		}
		
		System.out.println("Sum of cube of First "+n+" Natural Numbers: "+sum);

	}

}

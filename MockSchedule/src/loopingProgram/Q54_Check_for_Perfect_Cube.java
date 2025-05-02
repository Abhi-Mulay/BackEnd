package loopingProgram;
/*54. Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27


Output: Perfect Cube*/
import java.util.*;
public class Q54_Check_for_Perfect_Cube {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n=sc.nextInt();
		
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if((i*i*i) == n) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Prefect cube");
			
		}
		else {
			System.out.println("Not Prefect cube");
		}
	}

}

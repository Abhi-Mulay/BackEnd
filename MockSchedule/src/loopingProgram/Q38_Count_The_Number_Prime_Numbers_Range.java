package loopingProgram;
/*38. Count the Number of Prime Numbers in a Range
Description: Write a program to count the number of prime numbers between m and n.
Input: m = 1, n = 10


Output: 4
*/
import java.util.*;
public class Q38_Count_The_Number_Prime_Numbers_Range {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int primeCount=0;
		for(int i=2;i<=n;i++) {
			int count=0;
					for(int j=2;j<=i;j++) {
						if(i%j==0) {
							count++;
						}
					}
			if(count==1) {
				primeCount++;
			}
		}
		
		System.out.println("Count the Number of Prime Numbers in a Range "+primeCount);
	}

}

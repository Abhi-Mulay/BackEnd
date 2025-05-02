package oopProgram;
/*Q3. WAP to create class name as Perfect with two functions 
void setValue(): this function can accept number as parameter 
void checkPerfect(): this function can check number is perfect or not if perfect the show message number is perfect if not then show message number is not perfect
*/

import java.util.*;
class Perfect
{
	private int n;
	
	public void setValue(int n) {
		this.n=n;
	}
	
	public void checkPerfect() {
		
		int sum=0;
		
		for (int i = 1; i <n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
		
	}
}
public class Q3_Perfect_with_two_functions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		Perfect p = new Perfect();
		
		p.setValue(n);
		p.checkPerfect();
	
		
	}

}

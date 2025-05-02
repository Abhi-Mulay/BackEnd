package oopProgram;
/*Q2. WAP to create class name as Factorial with two functions 
void setNumber(): this function can accept the number as parameter
void displayFactorial(): this function can display the factorial of number  

*/
import java.util.*;
class Factorial{
	private int n;
	
	public void setNumber(int n) {
		this.n=n;
	}
	
	public void displayFactorial() {
		int mul=1;
		for (int i = 1; i <= n; i++) {
			mul*=i;
		}
		System.out.println(mul);
	}
}
public class Q2_Factorial_with_two_functions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		Factorial f = new Factorial();
		
		f.setNumber(n);
		f.displayFactorial();
	}

}

package oopProgram;
/*Q5. WAP to create class name as CountDigit with two functions 
 void setValue(): this function can accept number from keyboard 
 void showDigitCount(): this function can count the digit and display it.

*/
import java.util.*;
class CountDigit
{
	private int n;
	
	public void setValue(int n) {
		this.n=n;
	} 
	
	public void showDigitCount() {
		
		int count=0;
		int temp=n;
		while(temp!=0) {
			temp/=10;
			count++;
		}
		
		System.out.println("Count of digit is "+count);
	}
}
public class Q5_CountDigit_Of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		CountDigit c = new CountDigit();
		
		c.setValue(n);
		c.showDigitCount();
	}

}

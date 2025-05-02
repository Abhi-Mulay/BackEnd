package oopProgram;
/*Q4. WAP to create class name as Reverse with two functions 
void setNumber(): this function can accept the number from keyboard 
void reverseNumber(): this function can reverse the number and display it
 
*/
import java.util.*;

class Reverse
{
	private int n;
	
	public void setNumber(int n)
	{
		this.n=n;
	}
	
	public void reverseNumber() {
		
		
		int temp=n;
		int rev=0;
		
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		
		System.out.println("Before Reverse "+n);
		System.out.println("After Reverse "+rev);
	}
}
public class Q4_Reverse_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		Reverse r = new Reverse();
		
		r.setNumber(n);
		r.reverseNumber();
				
	}

}

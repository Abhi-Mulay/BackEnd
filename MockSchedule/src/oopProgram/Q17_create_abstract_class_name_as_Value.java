package oopProgram;
/*Q17. Write Program to create abstract class name as Value with one abstract and one non abstract method
void setValue(int ,int): this is non abstract method with two parameter abstract
 int getResult(): this is abstract method and you have two child class name as Power
  and you have to override getResult() method in Power class and calculate power of
   two values and return it as well as SearchDigit and you have to override getResult() 
   consider first parameter of setValue() is number and second parameter is digit and you 
   have to search digit in number and return it and if digit not found return -1.
*/
import java.util.*;

abstract class Value
{
	int a;
	int b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public abstract int getResult();
	
}
class Power extends Value
{
	public int getResult() {
		int mul=1;
		for (int i = 1; i <=b; i++) {
			mul=mul*a;
		}
		return mul;
	}
	
}

class SearchDigit extends Value
{
	public int getResult() {
		
		while(a!=0) {
			int rem=a%10;
			if(rem==b) {
				return b;
			}
			a/=10;
		}
		
		return -1;
	}
}
public class Q17_create_abstract_class_name_as_Value {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int x=sc.nextInt();
		
		System.out.println("Enter the number");
		int y=sc.nextInt();
		
		Power p = new Power();
		p.setValue(x, y);
		int result=p.getResult();
		
		System.out.println(result);
		
		SearchDigit s = new SearchDigit();
		s.setValue(x, y);
		int result2=s.getResult();
		System.out.println(result2);
		
		
	}

}

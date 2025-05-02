package oopProgram;
/*Q1. WAP to create class name as Table with two functions 
void setValue(): this function is used for accept number from keyboard 
void showTable(): this function can display the table of number 
 
*/
import java.util.*;
class Table{
	
	private int n;
	public void setValue(int n) {
		this.n=n;
	}
	
	public void showTable() {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
}
public class Q1Create_Table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Table t=new Table();
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		t.setValue(n);
		t.showTable();
	}

}

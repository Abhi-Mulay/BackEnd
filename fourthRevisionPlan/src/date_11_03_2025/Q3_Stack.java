//Q3.Stack Implementation - Implement a stack using Stack 
//  case 1: push()
//  case 2: pop()
//  case 3: peek() operations.
//  case 4: display stack value using last in first out 

package date_11_03_2025;
import java.util.*;
public class Q3_Stack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		do {
			System.out.println("case 1: push()");
			System.out.println("case 2: pop()");
			System.out.println("case 3: peek() operations.");
			System.out.println("case 4: display stack value using last in first out ");
			System.out.println("case 5: Exit");
			System.out.println("Enter the choice");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of stack");
				int size=sc.nextInt();
				for(int i=1;i<=size;i++)
				{
					s.push(sc.nextInt());
				}	
				
				break;
			case 2:
				System.out.println(s.pop());
				break;
			case 3:
				
				System.out.println(s.peek());
				
				break;
			case 4:
				System.out.println(s);
				break;
			case 5:
				break;
				
				default:
					System.out.println("Exiting the code....");
				
			}
		}while(true);
		
	}

}

package collection_Thread_FileHandaling;
/*Q4. WAP to create a stack and perform the following operation on it.
	Case1: push data in stack 
	Case 2: pop data from stack
	Case 3: display all data from stack

*/
import java.util.*;
public class Q4create_a_stack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack s = new Stack();
		
		do {
			System.out.println("Case1: push data in stack");
			System.out.println("Case 2: pop data from stack");
			System.out.println("Case 3: display all data from stack");
			System.out.println("case 4: Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				
				s.push(sc.nextLine());
				break;
				
			case 2:
	
				s.pop();
				break;
				
			case 3:
				System.out.println(s);
				break;
				
			case 4:
				System.exit(0);
				default:
					System.out.println("Invalid Choice");
				
			}
			
		}while(true);
	}

}

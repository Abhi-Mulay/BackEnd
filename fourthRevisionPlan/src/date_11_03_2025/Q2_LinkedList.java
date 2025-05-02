//Q2. LinkedList Implementation
//Create a LinkedList of strings, 
// case 1: add some element
// case 2: print the list
// case 3: remove elements from the front and rear.

package date_11_03_2025;
import java.util.*;

public class Q2_LinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList list = new LinkedList();
		do {
			System.out.println("case 1: add some element");
			System.out.println("case 2: print the list");
			System.out.println("case 3: remove elements from the front and rear.");
			System.out.println("case 4: Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
					for(int i=1;i<=5;i++)
					{
						list.add(sc.nextInt());
					}
				break;
			case 2:
				System.out.println(list);
				break;
			case 3:
				 if(!list.isEmpty()) {
					 list.removeFirst();
					 System.out.println("After removing first element "+list);
					 
					 list.removeLast();
						System.out.println("After removing rear element "+list);
				 } 
				 
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("Invalid input");
			}
			
		}while(true);
		
	}

}

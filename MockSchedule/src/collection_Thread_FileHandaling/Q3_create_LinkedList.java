package collection_Thread_FileHandaling;
/* Q3. WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first 
	Case 2: add Node at last 
	Case 3: remove node from first 
	Case 4: remove node from last 
	Case 5: view all data from linked list

*/

import java.util.*;
public class Q3_create_LinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList l=new LinkedList();
		
		do {
			
			System.out.println("Case 1: add Node at first ");
			System.out.println("Case 2: add Node at last");
			System.out.println("Case 3: remove node from first ");
			System.out.println("Case 4: remove node from last");
			System.out.println("Case 5: view all data from linked list");
			System.out.println("Case 6: Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				String n=sc.nextLine();
				l.addFirst(n);
				break;
				
			case 2:
				l.addLast(sc.nextLine());
				break;
				
			case 3:
				l.removeFirst();
				break;
				
			case 4:
				l.removeLast();
				break;
				
			case 5:
				
				for (Object obj : l) {
					System.out.println(obj);
				}
				break;
				
			case 6:
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid choice");
				
			}
			
		}while(true);
		
	}

}

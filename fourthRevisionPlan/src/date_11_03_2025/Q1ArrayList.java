//Q1. Basic ArrayList Operations & Create an ArrayList of integers,
// case 1: add some elements
// case 2: print the list
// case 3: remove an element at a specific index.

package date_11_03_2025;
import java.util.*;

public class Q1ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList a=new ArrayList();
		
		do {
			System.out.println("case 1: add some elements");
			System.out.println("case 2: print the list");
			System.out.println("case 3: remove an element at a specific index.");
			System.out.println("case 4. Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the size of arraylist");
				int size=sc.nextInt();
				
				for(int i=0;i<size;i++)
				{
					a.add(sc.nextInt());
				}
				
				break;
			case 2:
				System.out.println(a);
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i));
				}	
				break;
			case 3:
				System.out.println("Enter the index for remove the element");
				int index=sc.nextInt();
				
				a.remove(index);
				
				break;
			case 4:
				
				System.exit(0);
				System.out.println("Exiting code....");
				break;
				
			default:
				System.out.println("Invalid input");
				
			}
		}while(true);
		
	}

}

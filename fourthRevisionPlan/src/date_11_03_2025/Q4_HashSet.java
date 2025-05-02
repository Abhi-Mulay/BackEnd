//Q4.  Set Operations: Create a HashSet to store unique elements
// case 1: add elements to the set
// case 2: checking if an element exists
// case 3: finding the size of the set.

package date_11_03_2025;
import java.util.*;

public class Q4_HashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> s = new HashSet();
		do {
			System.out.println("case 1: add elements to the set");
			System.out.println("case 2: checking if an element exists");
			System.out.println("case 3: finding the size of the set.");
			System.out.println("case 4.Exit");
			System.out.println("Enter the choice");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of hashset");
				int size=sc.nextInt();
				for(int i=1;i<=size;i++)
				{
					s.add(sc.nextInt());
				}	
				
				break;
			case 2:
				int n=sc.nextInt();
				if(s.contains(n))
				{
					System.out.println("Element found");
				}
				else {
					System.out.println("Element not found");
				}	
				break;
			case 3:
					System.out.println("size of stack is "+s.size());
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("Exiting the code");
			}	
		}while(true);
		
	}

}

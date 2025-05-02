//Case 5: HashMap Basic Operations
//Create a HashMap to store key-value pairs, and perform operations such as insertion, deletion, and retrieval.

package date_11_03_2025;
import java.util.*;
import java.util.Map.Entry;

public class Q5_HashMap {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		HashMap <Integer, String>a = new HashMap();
		do {
			System.out.println("case 1. insert values in hashmap");
			System.out.println("case 2. delete spacifice element");
			System.out.println("case 3. retrieval");
			System.out.println("case 4. Exit the code");
			System.out.println("Enter the choice");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				for(int i=0;i<5;i++) {
					a.put(sc.nextInt(),sc.nextLine());
				}
				System.out.println(a);
				break;
			case 2:
				System.out.println("Enter the index ");
				
				int n=sc.nextInt();
				a.remove(n);
				break;
			case 3:
				
					System.out.println(a);
				
				break;
			case 4:
					System.exit(0);
				break;
				
				default:
					System.out.println("Invalid input");
			}
			
		}while(true);
		
	}

}

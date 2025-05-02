//Question4:  Unique Items Shopping Cart Using Set
//  Description: Use a HashSet to manage a shopping cart where no duplicate items are allowed.
//  Add items, remove an item, and check if a specific item is already in the cart.
package date_13_03_2025;
import java.util.*;

public class Q4_ShopingChart_UsingSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> cart=new HashSet();
		
		do {
			System.out.println("case 1: Add elements ");
			System.out.println("case 2: remove element");
			System.out.println("case 3: check the specific item in the cart");
			System.out.println("case 4: view the result");
			System.out.println("case 5: Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					for(int i=1;i<=3;i++) {
						cart.add(sc.nextLine());
					}
					break;
				case 2:
					System.out.println("Enter the item to bee remove");
					String rem=sc.nextLine();
					
					cart.remove(rem);
					
					break;
				case 3:
					System.out.println("Enter the item to bee chaeck");
					String check=sc.nextLine();
					if(cart.contains(check)) {
						System.out.println(check+" present");
					}
					else {
						System.out.println(check+" not present");
					}
					break;
				case 4:
					System.out.println(cart);
					break;
					
				case 5:
					System.out.println("Exiting...!😊");
					System.exit(0);
					default:
						System.out.println("Invalid input");
			}
			
		}while(true);
		
	}

}

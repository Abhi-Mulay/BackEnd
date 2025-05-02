//Question5:  Track Customer Orders Using HashMap
// Description: Create a HashMap to store customer names (keys) and their list of ordered items (values).
//Add, remove, and modify orders, and display all orders for a specific customer.

package date_13_03_2025;
import java.util.*;
public class Q5_Track_Customer_Orders_Using_HashMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String,List<String>> map=new HashMap<>(); 
		
		do {
			System.out.println("case 1: add Customer details and Order");
			System.out.println("case 2: remove Customer and his Order");
			System.out.println("case 3: modify order");
			System.out.println("case 4: Show Customer with his order ");
			System.out.println("case 5: show details");
			System.out.println("case 6: Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter the name");
				String name=sc.nextLine();
				
				System.out.println("Enter the oreder name");
				String [] item=sc.nextLine().split(" , ");
				
				map.put(name,new ArrayList<>(Arrays.asList(item)));
				System.out.println("order added "+name);
				
				break;
			case 2: 
				System.out.println("Enter the customer name to remove");
				name=sc.nextLine();
				
				if(map.remove(name) !=null) {
					System.out.println("Order removed"+name);
				}
				else {
					System.out.println("Customer not found");
				}
				
				break;
			case 3:
				System.out.println("Enter the customer name");
				name=sc.nextLine();
				
				if(map.containsKey(name)) {
					System.out.println("Enter the new order item");
					item=sc.nextLine().split(" , ");
					map.put(name,new ArrayList(Arrays.asList(item)));
				}
				break;
			case 4:
				System.out.println("Enter the customer name to remove");
				name=sc.nextLine();
				
				if(map.containsKey(name)) {
					System.out.println(map.get(name));
				}
				else {
					System.out.println("Customer not found");
				}
				
				break;
			case 5:
				if(map.isEmpty()) {
					System.out.println("No order available");
				}
				else {
					for(Map.Entry<String, List<String>> entry:map.entrySet()) {
						System.out.println(entry.getKey()+"----->"+entry.getValue());
					}
				}
				break;
			case 6:
				System.exit(0);
				default:
					System.out.println("Invalid input");
			}
		}while(true);
		
	}

}

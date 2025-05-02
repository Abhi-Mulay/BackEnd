package collection_Thread_FileHandaling;
/*2. WAP to create ArrayList and perform following operation on it 
	Case 1: add new data in ArrayList
	Case 2: view all data from ArrayList
Case 3: Search Data using contains method 
Case 4: Search data using indexOf() method 
Case 5: delete data using index
Case 6: count total number of element from ArrayList
Case 7: check ArrayList  is empty or not 
*/

import java.util.*;
public class Q2_create_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList a = new ArrayList();
		
		do {
			System.out.println("Case 1: add new data in ArrayList");
			System.out.println("Case 2: view all data from ArrayList");
			System.out.println("Case 3: Search Data using contains method");
			System.out.println("Case 4: Search data using indexOf() method ");
			System.out.println("Case 5: delete data using index");
			System.out.println("Case 6: count total number of element from ArrayList");
			System.out.println("Case 7: check ArrayList  is empty or not ");
			System.out.println("Case 8: Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				
				a.add(sc.nextInt());
				break;
				
			case 2:
				for (int i = 0; i < a.size(); i++) {
					System.out.println(a.get(i));
				}
				break;
				
			case 3:
				System.out.println("Enter the number");
				int search=sc.nextInt();
				
				if(a.contains(search)) {
					System.out.println("Data found");
				}
				else {
					System.out.println("Data not found");
				}
				break;
				
			case 4:
				
				System.out.println("Enter the index");
				int index=sc.nextInt();
				
				int searchIndex=a.indexOf(index);
				if(searchIndex!=-1) {
					System.out.println("Element found");
				}
				else {
					System.out.println("Element not found");
				}
				break;
				
			case 5:
				System.out.println("Enter the index to delete elements");
				int ind=sc.nextInt();
				for (int i = 0; i < a.size(); i++) {
					if(ind == i) {
						a.remove(i);
					}
				}
				break;
				
			case 6:
				
				System.out.println(a.size());
				break;
				
			case 7:
				if(!a.isEmpty()) {
					System.out.println("Elements present");
				}
				else {
					System.out.println("Elements not presents");
				}
				break;
				
			case 8:
				System.exit(0);
				
				default:
					System.out.println("Invalid Choice");
				
				
			}
			
		}while(true);
	}

}

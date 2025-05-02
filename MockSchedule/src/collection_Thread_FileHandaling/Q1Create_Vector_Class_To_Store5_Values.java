package collection_Thread_FileHandaling;
/*Q1.WAP to create Vector class and store 5 values in it and display vector data using a following methods 

Show the vector data using Enumeration 
Show the vector data using Iterator 
Show the vector data using normal for loop
Show the vector data using foreach 
Show the vector data using ListIterator 
*/

import java.util.*;
public class Q1Create_Vector_Class_To_Store5_Values {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range of vector");
		int size=sc.nextInt();
		
		Vector v = new Vector();
		
		for (int i = 0; i < size; i++) {
			v.add(sc.nextInt());
		}
		do {

			System.out.println("case 1: Show the vector data using Enumeration ");
			System.out.println("case 2: Show the vector data using Iterator ");
			System.out.println("case 3: Show the vector data using normal for loop");
			System.out.println("case 4: Show the vector data using foreach ");
			System.out.println("case 5: Show the vector data using ListIterator");
			System.out.println("case 6: Exit");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				
				Enumeration e = v.elements();
				
				while(e.hasMoreElements()) {
					Object obj = e.nextElement();
					System.out.println(obj);
				}
				break;
				
			case 2:
				
				Iterator i=v.iterator();
				
				while(i.hasNext()) {
					Object obj=i.next();
					
					System.out.println(obj);
				}
				break;
				
			case 3:
				
				for (int j = 0; j < v.size(); j++) {
					System.out.println(v.get(j));
				}
				break;
				
			case 4:
				for(Object v1:v) {
					System.out.println(v1);
				}
				break;
				
			case 5:
				
				ListIterator<Integer> li=v.listIterator();
				
				while(li.hasNext()) {
					Object obj=li.next();
					System.out.println(obj);
				}
	
				break;
				
			case 6:
				System.exit(0);
				
				default:
					System.out.println("Invalid choice");
				
			}
		}while(true);
		
	}

}

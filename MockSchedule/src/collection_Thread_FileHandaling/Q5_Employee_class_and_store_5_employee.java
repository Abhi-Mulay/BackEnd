package collection_Thread_FileHandaling;
/*  Q5. WAP to create an Employee class and store  5 employee objects in the
 *  ArrayList collection and perform the following operation on it.
	Case 1: View All Employee Data
	Case 2: Search Employee by using its id.
	Case 3: Delete Employee by using its id.
	Case 4: update employee name by using its id.
	
*/

import java.util.*;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class Q5_Employee_class_and_store_5_employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList a=new ArrayList();
		
		for (int i = 1; i <=2; i++) {
			a.add(sc.nextInt());
			a.add(sc.nextLine());
			a.add(sc.nextDouble());
		}
		
		do {
			
			System.out.println("Case 1: View All Employee Data");
			System.out.println("Case 2: Search Employee by using its id.");
			System.out.println("Case 3: Delete Employee by using its id.");
			System.out.println("Case 4: update employee name by using its id.");
			
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				
				default:
					System.out.println("Invalid Choice");
				
			}
			
					
		}while(true);
	}

}

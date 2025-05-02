//Q1. Sorting an ArrayList
//Create an ArrayList of custom objects and sort them using Collections.sort() based on a specific field.
//Example: you have to create Employee class with field id,name and salary and sort employee data by using salary

package date_12_03_2025;
import java.util.*;
class Employee{
	 int id;
	 String name;
	 float salary;
	Employee(){
		
	}
	Employee(int id , String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Id"+id+"\t Name"+name+"\tsalary"+salary;
	}
}
public class Q1_Sorting_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> a=new ArrayList();
		
		for(int i=1;i<=2;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String n=sc.nextLine();
			float s=sc.nextFloat();
			a.add(new Employee(id,n,s));
		}
		
		Collections.sort(a, Comparator.comparingDouble(e -> e.salary));

		System.out.println(a);
		
	}

}

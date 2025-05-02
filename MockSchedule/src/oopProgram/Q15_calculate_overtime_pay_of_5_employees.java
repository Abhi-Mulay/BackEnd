package oopProgram;
/*Q15.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
Note- for a week only 40 hours of working are allowed. 
1. Create class Employee with data member ID, Name, total working, salary, overtime
Set Information by using a constructor and create a display Information() method to
display all information with salary.
2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
void calculateOvertime() to calculate overtime. 

System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getTotalworking()+"\t"+emp[i].getSalary()+"\t"+emp[i]);
		

*/

import java.util.*;
class Employee
{
	private int id;
	private String name;
	private int totalworking;
	private double salary;
	private int overtime;
	Employee(){
		
	}
	public Employee(int id, String name, int totalworking, double salary, int overtime) {
		
		this.id = id;
		this.name = name;
		this.totalworking = totalworking;
		this.salary = salary;
		this.overtime = overtime;
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
	public int getTotalworking() {
		return totalworking;
	}
	public void setTotalworking(int totalworking) {
		this.totalworking = totalworking;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}	
	public void display() {
		
			System.out.println(getId()+"\t"+getName()+"\t"+getTotalworking()+"\t\t"+getSalary()+"\t"+getOvertime());
		
	}
}
class OverTime
{
	Employee emp[];
	public void setEmployee(Employee emp[]) {
		this.emp=emp;
	}
	
	public void calculateOvertime() {
		
		for (int i = 0; i < emp.length; i++) {
		
			if((emp[i].getOvertime()+emp[i].getTotalworking())<=40) {
				
				emp[i].setSalary((emp[i].getOvertime()*50)+emp[i].getSalary());
			}
			else if((emp[i].getOvertime()+emp[i].getTotalworking())>40) {
				int total=40-emp[i].getTotalworking();
				
				emp[i].setSalary(total+emp[i].getSalary());
			}
		}
		
	}
}
public class Q15_calculate_overtime_pay_of_5_employees {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee e[]=new Employee[2];
		
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			System.out.println("Enter the name");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter the total working hour's");
			int hour=sc.nextInt();
			
			System.out.println("Enter the salary");
			double salary=sc.nextDouble();
			
			System.out.println("Enter the overtime");
			int overtime=sc.nextInt();
			
			e[i]=new Employee(id,name,hour,salary,overtime);
			
		}
		
		OverTime o = new OverTime();
		o.setEmployee(e);
		o.calculateOvertime();
		
		System.out.println("ID\tNAME\tTOTALWORKING\tSALARY\tOVERTIME");
		for (int i = 0; i < e.length; i++) {
			e[i].display();
		}
	}

}

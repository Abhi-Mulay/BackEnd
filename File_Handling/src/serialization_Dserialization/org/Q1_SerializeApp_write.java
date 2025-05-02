package serialization_Dserialization.org;
import java.util.*;
import java.io.*;

class Employee implements Serializable
{
	private int id;
	private String name;
	transient private double salary;
	
	Employee(){
		
	}
	Employee(int id, String name, double salary){
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Q1_SerializeApp_write {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			FileOutputStream fout  =new FileOutputStream("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter.txt");
			
			ObjectOutputStream Oout =new ObjectOutputStream(fout);
			int i=1;
			while(i<=5) {
				System.out.println("Enter the id");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name");
				String name=sc.nextLine();
				
				System.out.println("Enter the salary");
				double salary=sc.nextDouble();
				
				Employee e1 = new Employee(id, name, salary);

				Oout.writeObject(e1);
				i++;
			}
			Oout.close();
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Data save Successfully");
		}
	}

}

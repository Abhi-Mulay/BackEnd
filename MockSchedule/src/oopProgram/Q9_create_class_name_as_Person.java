package oopProgram;
/*Q9. WAP to create class name as Person with field id,
 * name,age and address and input data and display it*/

import java.util.*;
class Person
{
	private int id;
	private String name;
	private int age;
	private String add;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void display() {
		System.out.println(getId()+"\t"+getName()+"\t"+getAge()+"\t"+getAdd());
	}
}
public class Q9_create_class_name_as_Person {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Books capacity");
		int size=sc.nextInt();
		
		Person p[] = new Person[size];
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter the id");
			int id=sc.nextInt();
			
			System.out.println("Enter the Name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter the Age");
			int age=sc.nextInt();
			
			System.out.println("Enter the Address");
			sc.nextLine();
			String add=sc.nextLine();
			
			p[i]=new Person();
			p[i].setId(id);
			p[i].setName(name);
			p[i].setAge(age);
			p[i].setAdd(add);
		}
		System.out.println("ID\tNAME\tAge\tAddress\n");
		for (int i = 0; i < p.length; i++) {
			p[i].display();
		}
		
	}

}

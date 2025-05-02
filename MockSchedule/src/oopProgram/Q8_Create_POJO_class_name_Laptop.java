package oopProgram;
/*
Q8. WAP to create POJO class name as Laptop with field id,
 name ,price and ram space,hard disk space etc 
 and input the details of laptop and display it
*/
import java.util.*;
class Laptop
{
	private int id;
	private String name;
	private double price;
	private double ram;
	private double diskSpace;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getDiskSpace() {
		return diskSpace;
	}
	public void setDiskSpace(double diskSpace) {
		this.diskSpace = diskSpace;
	}
	
	public void display() {
		System.out.println(getId()+"\t"+getName()+"\t"+getPrice()+"\t"+getRam()+"\t"+getDiskSpace());
	}
}
public class Q8_Create_POJO_class_name_Laptop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Books capacity");
		int size=sc.nextInt();
		
		Laptop lp[] = new Laptop[size];
		
		for (int i = 0; i < lp.length; i++) {

			System.out.println("Enter the Laptop ID");
			int id=sc.nextInt();
			
			System.out.println("Enter the Laptop NAME");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter the Laptop PRICE");
			double price=sc.nextDouble();
			
			System.out.println("Enter the Laptop RAM SPACE");
			double ram=sc.nextDouble();
			
			System.out.println("Enter the Laptop DISK SPACE");
			double disk=sc.nextDouble();
			
			lp[i]=new Laptop();
			lp[i].setId(id);
			lp[i].setName(name);
			lp[i].setPrice(price);
			lp[i].setRam(ram);
			lp[i].setDiskSpace(disk);
		}
		System.out.println("ID\tNAME\tPRICE\tRAM\tDISK");
		for (int i = 0; i < lp.length; i++) {
			lp[i].display();
		}
	}

}

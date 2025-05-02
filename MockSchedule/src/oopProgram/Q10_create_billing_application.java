package oopProgram;

import java.util.Scanner;

/* Q10. WAP to create billing application 
Classes 
Customer : id,name and mobile mark as POJO class
Product class: id,name,price,qty,rate 
Bill class contain method 
void calBill(Customer c,Product …p): this function can 
accept single customer detail and multiple product details
 and your output should like as

*/
import java.util.*;
class Customer
{
	private int id;
	private String name;
	private int mobile;
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
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
}
class Product
{
	private int id;
	private String name;
	private double price;
	private double qty;
	public int getPId() {
		return id;
	}
	public void setPId(int id) {
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
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	
}

class Bill extends Customer
{
	public void calBill(Customer c, Product ...p) {
		System.out.println("Customer Id: "+c.getId());
		System.out.println("Customer Name: "+c.getName());
		System.out.println("Customer Mobile: "+c.getMobile());
		double sum=0;
		System.out.println("Id\tName\tQty\tPrice\tTotal");
		
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getPId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getPrice()+"\t"+(p[i].getQty()*p[i].getPrice()));
			sum+=(p[i].getQty()*p[i].getPrice());
		}
		System.out.println("\t\tComplet Total\t"+sum);
	}
}
public class Q10_create_billing_application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Customer c = new Customer();
		
		System.out.println("Enter the customer id");
		int id=sc.nextInt();
		
		System.out.println("Enter the customer name");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter the customer mobile number");
		int mobile=sc.nextInt();
		
		System.out.println("Enter the Product types");
		int psize=sc.nextInt();
		
		c.setId(id);
		c.setName(name);
		c.setMobile(mobile);
		
		Product p[]=new Product[psize];
		
		for (int i = 0; i < p.length; i++) {
			System.out.println("Enter the Product id");
			int pid=sc.nextInt();
			
			System.out.println("Enter the Product name");
			sc.nextLine();
			String pname=sc.nextLine();

			System.out.println("Enter the Product Quantity");
			double qty=sc.nextDouble();
			
			System.out.println("Enter the Product price");
			double price=sc.nextDouble();
			
			p[i]=new Product();
			p[i].setPId(pid);
			p[i].setName(pname);
			p[i].setPrice(price);
			p[i].setQty(qty);
			
		}
		
		Bill b = new Bill();
		b.calBill(c, p);
		
	}

}

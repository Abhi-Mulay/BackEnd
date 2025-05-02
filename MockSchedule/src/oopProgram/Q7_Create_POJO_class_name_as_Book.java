package oopProgram;
/*Q7. WAP to create POJO class name as Book  
 * with field id,name and price and author and 
 * input the book details and display it.
*/
import java.util.*;
class Book
{
	private int id;
	private String name;
	private double price;
	private String author;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println(getId()+"\t"+getName()+"\t"+getPrice()+"\t"+getAuthor());
	}
	
}
public class Q7_Create_POJO_class_name_as_Book {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Books capacity");
	int size=sc.nextInt();
	
	Book b[]=new Book[size];
	
	for (int i = 0; i < b.length; i++) {
		System.out.print("Enter the book id  ");
		int id=sc.nextInt();
		
		System.out.print("\nEnter the book name  ");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.print("\nEnter the book author  ");
		String author=sc.nextLine();
		
		System.out.print("\nEnter the book price  ");
		double price=sc.nextDouble();
		
		b[i]=new Book();
		b[i].setId(id);
		b[i].setName(name);
		b[i].setAuthor(author);
		b[i].setPrice(price);
	}
	System.out.println("Id\tName\tPrice\tAuthor");
	System.out.println("");
	for (int i = 0; i < b.length; i++) {
		b[i].display();
	}
	
	}

}

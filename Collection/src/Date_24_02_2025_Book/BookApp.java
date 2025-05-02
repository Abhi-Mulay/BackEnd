package Date_24_02_2025_Book;
import java.util.*;
class Book
{
	private int  id;
	private String name;
	private String pub;
	private int price;
	
	
	Book()
	{
		
	}
	Book(int id , String name, String pub, int price)
	{
		this.id=id;
		this.name=name;
		this.pub=pub;
		this.price=price;	
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
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString()
	{
		return "Book ID= "+id+", Name= "+name+", Publisher= "+pub+", Price= "+price;
	}
}
public class BookApp {
	 private Stack bookStack = new Stack();
	public void addBook(Book book)
	{
		bookStack.push(book);
		System.out.println("Book added Successfully...👍👍👍👍👍");
	}
	
	public void viewBook()
	{
		if(bookStack.isEmpty()) {
			System.out.println("No Book avialabe in the stack");
		}
		else {
			System.out.println("Book in the Stack");
			for(Object obj:bookStack)
			{
				Book book=(Book)obj;//upcasting
				System.out.println(book);
			}
		}
	}
	public void topBook()
	{
		if(bookStack.isEmpty())
		{
			System.out.println("No Book found");
		}
		else {
			System.out.println("Top Book"+(Book) bookStack.peek());
		}
	}
	
	public void deleteBook()
	{
		
	}
	public static void main(String[] args) {
		
		BookApp bookstore=new BookApp();
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		do 
		{
			
			System.out.println("Case 1: Add New Book in Stack ");
			System.out.println("Case 2: View All Books from Stack");
			System.out.println("Case 3: Check Top Most book ");
			System.out.println("Case 4: delete book using id from stack");
			System.out.println("Case 5: Search book present in stack or not ");
			System.out.println("Case 6: count the total numbers from stack");
			System.out.println("Enter your choice");
			
			int choice=sc.nextInt();
			
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter the book details\n");
				 
				 System.out.println("Book Id");
				 int id=sc.nextInt();
				 
				 System.out.println("Enter the Book Name");
				 sc.nextLine();
				 String name=sc.nextLine();
				 
				 System.out.println("Enter the publisher");
				 String pub=sc.nextLine();
				 
				 System.out.println("Enter the Book Price");
				 int price=sc.nextInt();
				 
				
				 
				 bookstore.addBook(new Book(id, name, pub, price));
				 
				 break;
			 case 2:
				bookstore.viewBook();
				 break;
			 case 3:
				 bookstore.topBook();
				 break;
			 case 4:
				 
				 break;
			 case 5:
				 break;
			 case 6:
				 break;
			 case 7:
				 System.exit(0);
				 default:
					 System.out.println("Wrong choice");
				 
			 }
			 
		}while(true);
		
		

	}

}

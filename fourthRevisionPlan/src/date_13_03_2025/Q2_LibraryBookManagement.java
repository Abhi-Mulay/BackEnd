//Question2: . Library Book Management Using Stack
//Description: Implement a Stack to keep track of books being borrowed and returned in the library. Each time a book is borrowed, it’s pushed onto the stack, and when returned, it’s popped off.

package date_13_03_2025;
import java.util.*;
class Book
{
	private Stack<String> stack;
	
	Book(){
		stack =new Stack<>();
	}
	
	public void borrowBook(String bName) {
		stack.push(bName);
		System.out.println("Borrowed "+bName);
	}
	public void returnBook(){
		if(!stack.isEmpty()) {
			String book=stack.pop();
			System.out.println("returned"+book);
		}
		else {
			System.out.println("No book to return");
		}
	}
	public void viewBook() {
		if(stack.isEmpty()) {
			System.out.println("No book is present");
		}
		else {
			for(int i=stack.size()-1;i>=0;i--) {
				System.out.println(stack.get(i));
			}
			
		}
	}
	
}

public class Q2_LibraryBookManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book book = new Book();
		do {
			System.out.println("case 1. Enter the book name");
			System.out.println("case 2. return book");
			System.out.println("case 3. View Borrowed book");
			System.out.println("case 4. Exit");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter the book name");
				String name=sc.nextLine();
				book.borrowBook(name);
				break;
			case 2:
				book.returnBook();
				break;
			case 3:
				book.viewBook();
				break;
				default:
					System.out.println("Invalid input");
			}
			
		}while(true);
		
	}

}

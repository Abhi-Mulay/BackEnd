//Q6.  Sorting a List of Products by Price Using Comparator
//Description: Create a list of Product objects with name and price fields.
//Sort the list of products by price in ascending order using a Comparator.

package date_15_03_2025;
import java.util.*;
class Product{
	 String name;
	 double salary;
	
	Product(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return name+"\t"+salary;
	}
}
public class Q6_Sorting_List_Products_Price_Using_Comparator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Product> list=new ArrayList();
		
		for(int i=1;i<=3;i++) {
			String n=sc.nextLine();
			double s=sc.nextDouble();
			sc.nextLine();
			list.add(new Product(n,s));
		}
		
		System.out.println("Without sorting");
		System.out.println(list);
		Collections.sort(list, Comparator.comparingDouble(p -> p.salary));
		
		System.out.println("After sorting");
		for(Product p:list) {
			System.out.println(p);
		}

	}

}

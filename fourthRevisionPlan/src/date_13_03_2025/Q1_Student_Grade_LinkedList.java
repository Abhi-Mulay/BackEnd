//Question1 : Student Grade List Using LinkedList
// Description: Use a LinkedList to store student names and their grades. 
//Implement methods to add a student’s grade, display all students and their grades, and
//remove students who failed (grade below 50)
package date_13_03_2025;
import java.util.*;

class Student {
	private String name;
	private double grade;
	Student(){
		
	}
	Student(String name, double grade){
		this.name=name;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String toString() {
		return "\nName\t"+name+"\nGrade\t"+grade;
	}
}

public class Q1_Student_Grade_LinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> list = new LinkedList();
		Student s=new Student();
		do {
			System.out.println("case 1.add student details ");
			System.out.println("case 2.remove student who has less then 50 marks");
			System.out.println("case 3.show details");
			System.out.println("case 4.Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				for(int i=1;i<=2;i++) {
					sc.nextLine();
					System.out.println("Enter name");
					String n=sc.nextLine();
					System.out.println("Enter grade");
					double g=sc.nextDouble();
					
					list.add(new Student(n,g));
				}
				
				break;
			case 2:
				if(s.getGrade()<50) {
					list.remove(s.getGrade());
					System.out.println(list);
				}
				else {

					System.out.println(list);
				}
				break;
			case 3:
				System.out.println(list);
				break;
			case 4:
				System.exit(0);
				default:
					System.out.println("Invalid input");
			}
		}while(true);
	}

}

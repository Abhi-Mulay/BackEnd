package oopProgram;
/*Q11. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class 
VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then 
display its data otherwise not

VotingMachineApp: this method cantains voter details and pass to VotingMachine class 

*/
import java.util.*;

class Voter
{
	private int id;
	private String name;
	private int age;
	
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
	
}

class VotingMachine
{
	public void acceptWord(Voter ...v)
	{
		for (int i = 0; i < v.length; i++) {
			if(v[i].getAge()>=18) {
				System.out.println(v[i].getId()+"\t"+v[i].getName()+"\t"+v[i].getAge());
			}
		}
	}
}
public class Q11_Create_Voting_application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Voter v[] = new Voter[5];
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Enter the Id");
			int id=sc.nextInt();
			
			System.out.println("Enter the name");
			sc.nextLine();
			String name=sc.nextLine();
			
			System.out.println("Enter the age");
			int age=sc.nextInt();
			
			v[i]=new Voter();
			v[i].setId(id);
			v[i].setName(name);
			v[i].setAge(age);
			
		}
		
		VotingMachine vot = new VotingMachine();
		
		System.out.println("ID\tNAME\tAGE");
		vot.acceptWord(v);
		
	}

}

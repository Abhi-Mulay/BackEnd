package oopProgram;
/*Q6. WAP to create POJO class name as Player with id, 
 * name and run and input the data from keyboard
 *  and display it.*/

import java.util.*;
class Player
{
	private int id;
	private String name;
	private int run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
	public void display() {
		System.out.println(getId()+"\t"+getName()+" "+getRun());
	}
}

public class Q6_create_POJO_class_name_as_Player {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Player Id");
		int id=sc.nextInt();
		
		System.out.println("Enter the Player Name");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter the Player Run");
		int run=sc.nextInt();
		
		Player player = new Player();
		
		player.setId(id);
		player.setName(name);
		
		player.setRun(run);
		
		player.display();
	}

}

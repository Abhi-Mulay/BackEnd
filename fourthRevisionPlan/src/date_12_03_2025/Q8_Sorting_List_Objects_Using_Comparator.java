//Q8. Sorting a List of Objects Using Comparator
//Write a program that sorts a list of custom objects using a Comparator and displays the sorted list
//Note: you have to create Player objects in with field id,name and run and sort the player record using following terms
//Case 1: sort player by id
//Case 2: sort player by run

package date_12_03_2025;
import java.util.*;
class Player{
	private int id;
	private String name;
	private int run;
	Player(int id,String name, int run){
		this.id = id;
		this.name = name;
		this.run=run;
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
	
	public void setRun(int run) {
		this.run=run;
	}
	public int getRun() {
		return run;
	}
	
	public String toString() {
		return "\nID\t"+id+"\nName\t"+name+"\nRun\t"+run;
	}
}
class SortById implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		
		return Integer.compare(p1.getId(),p2.getId());
	}
	
}
class SortByRun implements Comparator<Player>{
public int compare(Player p1, Player p2) {
		
		return Integer.compare(p1.getRun(),p2.getRun());
	}
}
public class Q8_Sorting_List_Objects_Using_Comparator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Player> list=new ArrayList();
		for(int i=0;i<3;i++) {
			System.out.println("Enter Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.nextLine();
			System.out.println("Enter runs");
			int run=sc.nextInt();
			list.add(new Player(id,name,run));
		}
		do {
			System.out.println("case 1. sort Player by id");
			System.out.println("Case 2: sort player by run");
			System.out.println("case 3: Exit the code");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(list, new SortById());
				System.out.println("sort player by ID :\n"+list);
				break;
			case 2:
				Collections.sort(list, new SortByRun());
				System.out.println("sort player by Run :\n"+list);
				
				break;
			case 3:
				System.out.println("Thank You...!");
				System.exit(0);
				default:
					System.out.println("Invalid Input");
			}
			
		}while(true);
		
	}

}

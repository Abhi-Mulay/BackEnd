//Question3:  Queue for Print Job Management
// Description: Use a Queue to manage print jobs in a printing system.
// When a user submits a print job, it’s added to the queue, and jobs are processed
//(printed) in the order they are added.
package date_13_03_2025;
import java.util.*;
public class Q3_JobManagement {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		Queue q=new LinkedList();
		do {
			System.out.println("case 1: add Jobs");
			System.out.println("case 2: view Jobs");
			System.out.println("case 3: Exit");
			
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				for(int i=0;i<5;i++) {
					q.offer(sc.nextLine());
				}
				break;
				case 2:
					
					System.out.println(q);
					break;
				case 3:
					System.exit(0);
					default:
						System.out.println("Invalid Number");
			}
			
		}while(true);
		
	}

}

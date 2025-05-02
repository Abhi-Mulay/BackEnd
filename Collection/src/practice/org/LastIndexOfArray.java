package practice.org;
import java.util.*;
public class LastIndexOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List <Integer>a=new ArrayList();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(200);
		a.add(400);

		ListIterator<Integer> li= a.listIterator();

		System.out.println("In forward diraction");
		 while (li.hasNext()) {
	            System.out.println(li.next());
	            System.out.println(li.nextIndex());
	        }
		
		System.out.println("In backWord diraction");
		
		while(li.hasPrevious()) {

			System.out.println(li.previous());
			System.out.println(li.previousIndex());
		}
	}

}

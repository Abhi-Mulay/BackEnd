//Q7. List Reversal Using LinkedList
//Write a program that reverses the order of elements in a LinkedList using an iterator.

package date_12_03_2025;
import java.util.*;
public class Q7List_Reverse_Using_LinkList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list=new LinkedList();
		
		for(int i=1;i<=5;i++) {
			list.add(sc.nextInt());
		}
		List <Integer> rev=new LinkedList();
		Iterator <Integer>i=list.iterator();
		
		while(i.hasNext()) {
			
			rev.addFirst(i.next());
			
		}
		System.out.println(rev);
		
		
	}

}

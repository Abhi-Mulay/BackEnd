package practice.org;
import java.util.*;

public class fetch_Data_From_Collection {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			System.out.println(obj);
		}
	}

}

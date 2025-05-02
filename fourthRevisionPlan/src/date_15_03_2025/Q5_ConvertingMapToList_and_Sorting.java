//Q5. Converting Map to List and Sorting
// Description: Convert a HashMap (employee name as key and salary as value) into a
//List of entries and sort them by salary in descending order.
 
package date_15_03_2025;
import java.util.*;
public class Q5_ConvertingMapToList_and_Sorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Double> map = new HashMap();
		for(int i=1;i<=3;i++) {
			String n=sc.nextLine();
			Double sal=sc.nextDouble();
			sc.nextLine();
			map.put(n, sal);
		}
		List<Map.Entry<String, Double>> list=new ArrayList(map.entrySet());
		list.sort((l1,l2)-> l1.getValue().compareTo(l2.getValue()));
		
		for(Map.Entry<String, Double> entry: list) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}

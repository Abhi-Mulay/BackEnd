//Q6. Frequency Count Using HashMap
//Write a program that takes an array of integers and counts the frequency of each element using a HashMap.

package date_11_03_2025;
import java.util.*;

public class Q6_Frequency_Count {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		HashMap<Integer , Integer> map=new HashMap();
		
		for(int i=0;i<a.length;i++) {
			Integer count=map.get(a[i]);
			if(count==null)
			{
				count= new Integer(0);
			}
			++count;
			map.put(a[i], count);
		}
		
		Set <Map.Entry<Integer, Integer>> set=map.entrySet();
		
		for(Map.Entry<Integer, Integer> m:set) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}

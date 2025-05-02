package Date28_02_2025;
import java.util.*;

import javax.swing.RowFilter.Entry;

public class Q3Application_Store_Team_Player_Records {

	public static void main(String[] args) {
	
		LinkedHashMap map=new LinkedHashMap();//hear we use map 
		ArrayList al=new ArrayList();//hear we use collection
		al.add("Rohit");
		al.add("Virat");
		al.add("Dhoni");
		
		ArrayList al1 = new ArrayList();//hear also we use collection
		al1.add("Head");
		al1.add("Stark");
		al1.add("Cummins");
		
		map.put("India",al);
		map.put("Aus",al1);
		Set<Map.Entry> set=map.entrySet();//we use hear generic <Map.Entry> <--- this is generic
		
		for(Map.Entry m:set)
		{
			Object obj=m.getKey();//getKey() is use for return unique key
			String key = (String)obj;
			
			Object val = m.getValue();// getValue() use for return value
			
			ArrayList a = (ArrayList)val;
			
			System.out.println("======"+key+"==========");
			for(Object o : a)
			{
				System.out.println(o);
			}
		}
		
	}

}

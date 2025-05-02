//5. Find the Most Frequent Element in an Array
//Write a program to find the most frequent element in an array. Use a Map to store the frequency of each element, and then determine the element with the highest frequency.
//Example:
//Input: [4, 5, 2, 3, 4, 5, 4]
//Output: 4
//

package date_16_03_2025;
import java.util.*;
public class Q5_Find_Most_Frequent_Element_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}		
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			Integer count=map.get(a[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map.put(a[i], count);
		}
		Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
		
		System.out.println(maxEntry.getKey()+"  "+maxEntry.getValue());
		
//		for(Map.Entry<Integer, Integer> set :map.entrySet()){
//			if(set.getValue()>set.getValue()) {
//				System.out.println(set.getKey()+"  "+set.getValue());
//			}
//		}
	}

}
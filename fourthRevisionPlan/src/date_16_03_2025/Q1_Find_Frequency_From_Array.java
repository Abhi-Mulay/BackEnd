//1. Find the Frequency of Elements in an Array
//Write a program to find the frequency of each element in a given array of integers. 
//Use a Map<Integer, Integer> to store the frequency of each element.
//Example:
//Input: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
//Output: {1=1, 2=2, 3=3, 4=4}

package date_16_03_2025;
import java.util.*;
public class Q1_Find_Frequency_From_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int []a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0 ; i<a.length;i++) {
			Integer count=map.get(a[i]);
			if(count==null) {
				count=new Integer(0);
			}
			count++;
			map.put(a[i], count);
		}
		
		
		for(Map.Entry<Integer,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
			
		}
	}

}

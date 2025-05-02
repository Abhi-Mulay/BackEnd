//6. Implement a Simple Phonebook Using Map
//Write a program that implements a simple phonebook system. Store names as keys and phone numbers as values using a Map<String, String>. Provide methods to add, remove, and lookup a phone number.
//Example:
//Input: add("Alice", "1234567890");
//Output: {"Alice": "1234567890"}

package date_16_03_2025;
import java.util.*;
public class Q6_Simple_Phonebook_Using_Map {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap();
		
		for(int i=1;i<=4;i++) {
			String n=sc.nextLine();
			int no=sc.nextInt();
			sc.nextLine();
			
			map.put(n, no);
		}
		
		
			System.out.println(map);
		
		
	}

}

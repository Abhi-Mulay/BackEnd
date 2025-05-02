//Q6. Implementing a Simple Phone Book Using HashMap
//Create a simple phone book program using a HashMap where the key is a person's name and the value is their phone number.


package date_12_03_2025;
import java.util.*;

public class Q6_PhoneBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap();
		
		for(int i=0;i<5;i++) {
			map.put(sc.nextLine(), sc.nextLine());
		}
		
		for(Map.Entry<String ,String> m : map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());	
		}	
	}
}

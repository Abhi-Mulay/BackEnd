package conversion;
import java.util.*;
public class Convert_Premetive_To_Reference_Type {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		Integer i=Integer.valueOf(n);
		System.out.println(i);
		
		String s=String.valueOf(n);
		System.out.println(s);
		
		Float f=Float.valueOf(n);
		System.out.println(f);
		
		
		
		
	}

}

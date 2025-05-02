package conversion;
import java.util.*;
public class Convert_String_To_int_float_double_by_Using_parse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		int a=Integer.parseInt(s);//we convert String object to premetive int
		
		float b=Float.parseFloat(s);//we convert String object to premetive float
		
		double c=Double.parseDouble(s);//we convert String object to premetive double
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

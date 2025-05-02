package conversion;
import java.util.*;
public class Offset_Mehtod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 10 character");
		char ch[]=new char[10];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i]=sc.next().charAt(0);
		}
		
		String s=new String(ch,0,ch.length);
		
		System.out.println(s);
	}

}

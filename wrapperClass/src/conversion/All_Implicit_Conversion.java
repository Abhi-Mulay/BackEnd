package conversion;
import java.util.*;

public class All_Implicit_Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a=111;
		long l=100;
		double dd=989;
		float ff=444;
		char ch='a';
		
		long b=a;
		float c=a;
		double d=a;
		
		double df=ff;
		
	
		float f=l;
		
		int ach=ch;
		long lch=ch;
		float fch=ch;
		double dch=ch;
		
		
		System.out.println("After converting into implicit ");
		
		System.out.println("int into long "+b);
		System.out.println("int into float "+c);
		System.out.println("int into double "+d);
		System.out.println("\nlong into double "+dd);
		System.out.println("long into float "+f);
		
		System.out.println("long into double "+df);
		System.out.println("\n char to int "+ach);
		System.out.println(" char to long "+lch);
		System.out.println("char to float "+fch);
		System.out.println(" char to double "+dch);
		
		
	}
}

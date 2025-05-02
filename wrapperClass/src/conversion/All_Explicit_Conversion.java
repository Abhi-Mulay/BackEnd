package conversion;
import java.util.*;
public class All_Explicit_Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		long l = 111;
		float f=222;
		double d=333;
		String s="1234";
		char ch='a';
		int a=444;
		byte b=127;
		
		int al=(int)l;
		int af=(int)f;
		int ad=(int)d;
		
		char cl=(char)l;
		char cf=(char)f;
		char cd=(char)d;
		char ca=(char)a;
		
		long lf=(long)f;
		
		short sa=(short)a;
		short sl=(short)l;
		short sf=(short)f;
		short sd=(short)d;
		
		byte ba=(byte)a;
		byte bl=(byte)l;
		byte bf=(byte)f;
		byte bd=(byte)d;
		byte bch=(byte)ch;

		System.out.println("other data type to int");
		System.out.println(al);
		System.out.println(af);
		System.out.println(ad);
		
		System.out.println("\n other data type to long");
		System.out.println(lf);
		
		System.out.println("\n other data type to short");
		System.out.println(sa);
		System.out.println(sl);
		System.out.println(sf);
		System.out.println(sd);
		
		System.out.println("\n other data type to char");
		System.out.println(cl);
		System.out.println(af);
		System.out.println(cd);
		System.out.println(ca);
		
		System.out.println("\n other data type to byte");
		System.out.println(ba);
		System.out.println(bl);
		System.out.println(bf);
		System.out.println(bl);
		System.out.println(bd);
		System.out.println(bch);
		
		
		
	}

}

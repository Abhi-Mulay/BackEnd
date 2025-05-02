package conversion;

public class Long_Reference_To_int_short_float_Primative {

	public static void main(String[] args) {
		
		Long l=12L;
		
		int a=l.intValue();
		short s=l.shortValue();
		float f=l.floatValue();
		
		System.out.println("Reference Long to int, short, float");
		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
	}

}

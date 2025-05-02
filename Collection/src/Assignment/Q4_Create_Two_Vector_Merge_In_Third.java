package Assignment;

/*Q4. WAP to  create two vectors and merge in the third vector and display it?*/
import java.util.*;
public class Q4_Create_Two_Vector_Merge_In_Third {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of vector");
		int size=sc.nextInt();
		
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		System.out.println("Enter the value's of first vector");
		for(int i=0;i<size;i++)
		{
			v1.add(sc.nextInt());
		}
		
		System.out.println("Enter the value's of Second vector");
		for(int i=0;i<size;i++)
		{
			v2.add(sc.nextInt());
		}
		
		Vector v3=new Vector();
		
//		v3.addAll(v1);
//		v3.addAll(v2);
		for(int i=0;i<v1.size();i++)
		{
			v3.add(v1.get(i));
		}
		
		for(int i=0;i<v2.size();i++)
		{
			v3.add(v2.get(i));
		}
		System.out.println("After merge the Two vector");
		for(int i=0;i<v3.size();i++)
		{
			System.out.println(v3.get(i));
		}
	}

}

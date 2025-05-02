package Assignment;
import java.util.*;
public class Q2_Dublicate_Value {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Vector v=new Vector();
		for(int i=0;i<size;i++)
		{
			int n=sc.nextInt();
			v.add(n);
		}
		Collections.sort(v);
		
	
		
		 for (int i = 0; i < v.size() - 1; i++) {
	            if (v.get(i).equals(v.get(i + 1))) {
	                System.out.println(v.get(i));
	                // Skip the same element to avoid duplicate printing
	                while (i < v.size() - 1 && v.get(i).equals(v.get(i + 1))) {
	                    i++;
	                }
	            }
	     }
	}

}

/*Q5. WAP to create Vector and reverse all elements of Vector without using the inbuilt method?*/
package Assignment;
import java.util.*;
public class Q5_Reverse_All_Elements_Without_Inbuilt_Method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of vector");
		int size=sc.nextInt();
		Vector v = new Vector();
		System.out.println("Enter the values in vector");
		
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		int first=0;
		int last=v.size()-1;
		while(last>first)
		{
	       int temp=(int)v.get(last);
	       v.set(last,v.get(first));//  here we use offset for transfer first value to last
	       v.set(first,temp);// here temp value to first
	       last--;
	       first++; 
		}
		
		for(int i=0;i<v.size();i++)
		{
			System.out.println("😊😊😊😊😊😊😊😊😊😊😊😊"+v.get(i)+"🤣🤣🤣🤣🤣🤣❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
		}
	}
}

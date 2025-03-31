package array.org;
import java.util.*;

public class Q5_Enter_Element_On_Specified_Position {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		
		int a[] = new int[size];
		
		for(int i=0 ; i < a.length-1 ; i++ )
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Index😊😊😊😊😊😊");
		int index=sc.nextInt();
		
		System.out.println("Enter the value");
		int value=sc.nextInt();
		
		for(int i=a.length-1 ; i>=index ; i--)
		{
			a[i] = a[i-1];
		}
		a[index]=value;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}

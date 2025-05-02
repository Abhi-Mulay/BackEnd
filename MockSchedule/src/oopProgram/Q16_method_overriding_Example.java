package oopProgram;
/* 
Q16. Write Program to perform method overriding you have to create class name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input 
sequence You have to create two child class name as ArrangeAscendingOrder 
and you have to inherit ArrParent class in it and override arrangeSeq() method 
in ArrangeAscendingOrder and sort array and display in ascending order and you have 
to create one more class name ReverseArray and override arrangeSeq() method from ArrParent 
and reverse array and display it.
*/
import java.util.*;
class ArrParent
{
	int arr[];
	
	public void setValue(int arr[]) {
		this.arr=arr;
	}
	
	public void arrangeSeq() {
		
	}
}
class ArrangeAscendingOrder extends ArrParent
{
	public void arrangeSeq() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}

class ReverseArray extends ArrParent
{
	public void arrangeSeq() {
		
		for (int i = 0; i < arr.length/2; i++) {
			int temp=arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i];
			arr[i]=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class Q16_method_overriding_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		ArrangeAscendingOrder a1=new ArrangeAscendingOrder();
		a1.setValue(a);
		a1.arrangeSeq();
		
		ReverseArray r = new ReverseArray();
		r.setValue(a);
		r.arrangeSeq();
		
	}

}

package Date_16_02_2025;
import java.util.*;
class RotateArray
{
	int a[];
	RotateArray(int a[],int p)
	{
		this.a=a;
		for(int i=0;i<=p;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
	}
	int [] getResult() {
		return a;
	}
	
}
public class Q1_Rotate_Array_To_Right_By_K_Step {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the values in array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position to be rotate");
		int p=sc.nextInt();
		RotateArray r =new RotateArray(a,p);
		for(int i=0;i<r.getResult().length;i++)
		{
			System.out.println(r.getResult()[i]);
		}
	}

}

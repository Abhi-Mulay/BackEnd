package Date_16_02_2025;
import java.util.*;
class  MergeSorted{
	int a[];
	int b[];
	int c[];
	 MergeSorted(int a[], int b[])
	 {
		 this.a=a;
		 this.b=b;
		
	 }
	 void merge()
	 {		
		  c=new int[a.length+b.length];
		 int k=0;
		 for(int i=0; i<a.length; i++)
		 {
			 c[k++]=a[i];
		 }
		 for(int i=0 ; i<b.length ; i++)
		 {
			 c[k++]=b[i];
		 }
	 }	 
	 int [] getMergeArr()
	 {
		 return c;
	 }
}
public class Q2_Merge_Two_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first array size");
		int size1=sc.nextInt();
		
		System.out.println("Enter the second array size");
		int size2=sc.nextInt();
		
		
		int a[]=new int[size1];
		int b[]=new int[size2];
		
		System.out.println("Enter the First array values 😊😊😊😊😊");
		
		for(int i=0;i<size1;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Second array values 😊😊😊😊😊😊😊");		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeSorted m = new  MergeSorted(a,b);
		m.merge();
		for(int i=0;i<m.getMergeArr().length;i++)
		 {
			 System.out.println(m.getMergeArr()[i]);
		 }
	}

}

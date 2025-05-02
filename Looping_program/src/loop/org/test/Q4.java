package loop.org.test;
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		int size=sc.nextInt();
		
		System.out.println("Enter the alphabets in array");
		
		char ch[]=new char[size];
		for(int i=0 ;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("Enter the size of second array");
		int size2=sc.nextInt();
		
		System.out.println("Enter the alphabets in array");
		
		char d[]=new char[size2];
		for(int i=0 ;i<d.length;i++)
		{
			d[i]=sc.next().charAt(0);
		}
		
		char a[]=new char[size+size2];
		int k=0;
		
		for(int i=0;i<ch.length;i++)
		{
			a[k++]=ch[i];
		}
		
		for(int i=0;i<d.length;i++)
		{
			a[k++]=d[i];
		}
		
		boolean b[]=new boolean[k];
		char m[]=new char[k];
		int n=0;
		for(int i=0 ;i <k;i++)
		{
			int count=0;
			if(!b[i])
			{
			
				for(int j=0;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
					
				}
			}
			if(count>1)
			{
				m[n++]=a[i];
			}
			
		}
		
		for(int i=0 ; i<n;i++)
		{
			System.out.println(m[i]);
		}
		
	}

}
//  a d o b e c o d e b
// a b c
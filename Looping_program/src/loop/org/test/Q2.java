package loop.org.test;
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0 ; i<a.length ;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag[]=new boolean[size];
		for(int i=0;i<a.length;i++)
		{
			int f=0;
			if(!flag[i])
			{
				for(int j=0;j<a.length;j++)
				{
					if(i!=j)
					{
						for(int k=0;k<a.length;k++)
						{
							if(j!=k && k!=i)
							{
								int sum=a[i]+a[j]+a[k];
								if(sum==0)
								{
									System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
									flag[i]=true;
									f=1;
									break;
								}
								else {
									f=0;
								}
								
							}
						}
						
						
					}
					if(f==1)
					{
						break;
					}
					
				}
			}
		}
		
	}

}
//
//-1
//0
//1
//2
//-1
//-4
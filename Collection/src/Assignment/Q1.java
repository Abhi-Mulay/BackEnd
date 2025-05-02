package Assignment;
import java.util.*;
public class Q1 {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		Vector v=new Vector();
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		
		boolean counted[]=new boolean[size];
		
		for(int i=0;i<size;i++)
		{
			int count=0;
			if(!counted[i])
			{
				for(int j=0;j<v.size();j++)
				{
					if(v.get(i)==(v.get(j)))
					{
						count++;
						counted[j]=true;
					}
				}
				
					System.out.println(v.get(i)+"  count  "+count);
				
			}
		}
		
	}
}

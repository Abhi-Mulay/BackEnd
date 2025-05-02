	package loop.org;
	import java.util.*;
	public class Q5 {
		
		public static void main(String x[])
		{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Eneter the number");
			int n=sc.nextInt();
			
			int i=1;
			
			while(i!=n)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
				i++;
			}
		}
	}

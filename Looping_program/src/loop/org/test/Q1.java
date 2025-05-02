package loop.org.test;

public class Q1 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5;i++)
		{
			int flag=0;
			int k=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=5+i  && j>=6-i && flag==0 )
				{
					System.out.print(k++);
					flag=1;
				}
				
				else {
					System.out.print(" ");
					
					flag=0;
				}
			}
			System.out.println();
		}
		
		
		
	}

}

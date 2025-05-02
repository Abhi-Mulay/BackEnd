package Date_20_02_2025;

public class Q2Pattern {

	public static void main(String[] args) {
	
		for(int i=1;i<=4;i++)
		{
			char ch=(char)(64+i);
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.printf("%c",ch);
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}

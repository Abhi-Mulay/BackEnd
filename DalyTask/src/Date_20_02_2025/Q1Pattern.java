package Date_20_02_2025;

public class Q1Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

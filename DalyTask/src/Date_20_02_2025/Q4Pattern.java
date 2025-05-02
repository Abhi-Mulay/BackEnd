package Date_20_02_2025;

public class Q4Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			char ch=(char)(69-i);
			for(int j=1;j<=4;j++)
			{
				if(j<=5-i)
				{
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

//1234
//123
//12
//1

package Date_20_02_2025;

public class Q18Pattern {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=4 ;i++)
		{
			for(int j=1 ;j<=4;j++)
			{
				if(j<=5-i)
				{
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}

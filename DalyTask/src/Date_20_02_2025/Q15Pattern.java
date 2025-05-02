
//   *
//  * *
// *   *
//* 	 *

package Date_20_02_2025;

public class Q15Pattern {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=4;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j>=5-i && j<=5-i)
				{
					System.out.print("*");
				}
				else if(j<=3+i && j>=3+i && i<4 || j==8 && i==4)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
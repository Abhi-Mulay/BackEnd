//* * * * *
// * * * *
//  * * *
//   * *
//    *

package practice_pattern.org;

public class Q1 {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=5;i++)
		{
			int flag=0;
			for(int j=1;j<=10;j++)
			{
				if(j>=i && j<=11-i && flag==0)
				{
					System.out.print("*");
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

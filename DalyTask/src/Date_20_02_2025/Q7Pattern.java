//   1
//  121
// 12321
//1234321
// 12321
//  121
//   1

package Date_20_02_2025;

public class Q7Pattern {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=7;i++)
		{
			int count=0;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i && j<=i+3 && i <= 4 && j <= 4)
				{
					System.out.print(++count);
				}
				else if(j>=5-i && j<=i+3 && i <= 4 && j>4)
				{
					System.out.print(--count);
				}
				else if(j>=i-3&& j<=11-i && i>4 && j <=4)
				{
					System.out.print(++count);
				}
				else if(j>=i-3&& j<=11-i && i>4 && j >4)
				{
					System.out.print(--count);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

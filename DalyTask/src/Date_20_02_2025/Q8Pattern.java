//   A
//  ABA
// ABCBA
//ABCDCBA
// ABCBA
//  ABA
//   A

package Date_20_02_2025;

public class Q8Pattern {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=7 ; i++)
		{
			char ch=64;
			for(int j=1 ;j <=7 ;j++)
			{
				if(j>=5-i && j<=i+3 && i<=4 && j<=4)
				{
					System.out.print(++ch);
				}
				else if(j>=5-i && j<=i+3 && i<=4 && j>4)
				{
					System.out.print(--ch);
				}
				else if(j>=i-3 && j<=11-i && i>4 && j<=4)
				{
					System.out.print(++ch);
				}
				else if(j>=i-3 && j<=11-i && i>4 && j>4){
					System.out.print(--ch);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}

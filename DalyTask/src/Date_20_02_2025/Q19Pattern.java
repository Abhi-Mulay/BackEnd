//XOXO
//OXOX
//XOXO
//OXOX

package Date_20_02_2025;

public class Q19Pattern {

	public static void main(String[] args) {

		for(int i=1 ;i<=4 ;i++)
		{
			 
			for(int j=1 ;j<=4;j++)
			{
				if(i==j|| j==i+2 || j==i-2)
				{
					System.out.print("x");
				
				}
				else {
					System.out.print("o");
					
				}
			}
			
			System.out.println();
		}
		
	}

}

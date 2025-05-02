//A
//AB
//ABC
//ABCD

package Date_20_02_2025;

public class Q6Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			char ch=65;
			for(int j=1;j<=i;j++)
			{
//				char ch=(char)(64+j);
				System.out.print(ch++);
			}
			System.out.println();
		}
		
	}

}

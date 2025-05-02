package loopingProgram;
/*19. Print Inverted Number Pattern
Description: Write a program to print an inverted number pattern.
Input: n = 5


Output:

 Copy
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
public class Q19_Print_Inverted_Number_Pattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=6-i;
			for(int j=1;j<=5;j++) {
				if(j<=6-i) {
					System.out.print(k--);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

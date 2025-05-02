//   1
//  1 1
// 1 2 1
//1 3 3 1

package Date_20_02_2025;

public class Q9Pattern {

	public static void main(String[] args) {
		
				for(int i = 0 ; i <= 3 ;  i++) {
					
					int num = 1;
					for(int k = 0 ; k <= i; k++) {
						System.out.print(num+" ");
						num = num * (i - k)/(k + 1);
					}
					System.out.println();
				}
				
			}

		}
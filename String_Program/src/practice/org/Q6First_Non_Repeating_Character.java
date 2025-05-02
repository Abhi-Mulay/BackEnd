//Find the first non-repeating character in a string.

package practice.org;

import java.util.*;

public class Q6First_Non_Repeating_Character {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();

		char ch[] = s.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			int count = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(ch[j]);
				break;
			}
		}
	}
}

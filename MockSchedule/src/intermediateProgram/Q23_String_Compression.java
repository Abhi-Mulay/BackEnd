package intermediateProgram;
/*23. String Compression
Description: Implement string compression using counts of repeated characters.


Input: "aabcccccaaa"


Output: "a2b1c5a3"*/
import java.util.*;
public class Q23_String_Compression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		
		boolean b[]=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			
			if(!b[i]) {
				for(int j=i;j<ch.length;j++) {
					if(ch[i] == ch[j]) {
						count++;
						b[j]=true;
					}
					else {
					break;
				}
				}
			}
			if(count>=1) {
				System.out.println(ch[i]+"---->"+count);
			}

				
				
			
		}
	}

}

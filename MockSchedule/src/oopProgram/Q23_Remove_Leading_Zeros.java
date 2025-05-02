package oopProgram;
/*Q23. WAP to perform following operation on string 
Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098
Explanation: Removing all the elements from the beginning of String which doesn't add any value to the number. 

Your Task is:  you have to create class name as RemoveLeaningZero with two methods 

void setString(String s): this method accept string as parameter 
String getStringWithoutZero(): this method can remove zero and return string after removing leading zero.

*/

import java.util.*;
class RemoveLeaningZero
{
	private String s;
	public void setString(String s) {
		this.s=s;
	}
	public String getStringWithoutZero() {
		
		String newStr="";
		
		char ch[]=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='0') {
				for (int j = i; j < ch.length; j++) {
					newStr=newStr+ch[j];
				}
				break;
			}
		}
		return newStr;
	}
}

public class Q23_Remove_Leading_Zeros {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		String s=sc.nextLine();
		
		RemoveLeaningZero r = new RemoveLeaningZero();
		r.setString(s);
		
		System.out.println(r.getStringWithoutZero());
	}

}

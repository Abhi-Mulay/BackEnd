package oopProgram;
import java.util.*;

class StringData{
	String data;
	StringData(String data){
		this.data=data;
	}
	public int getLength() {
		char ch[]=data.toCharArray();
		
		return ch.length;
	}
	
	StringBuffer getConcat() {
		char ch[]=data.toCharArray();
		String newStr="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=97 && ch[i]<=122) {
				char ch1=(char) (ch[i]-32);
				newStr=newStr+ch1;
			}
		}
		StringBuffer s = new StringBuffer(newStr);
		
		return s;
	}
	
	StringBuffer getRev() {
		StringBuffer s=new StringBuffer(data);
		s=s.reverse();
		
		return s;
	}
}

public class Q21StringBuffer_Concat_Reveres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		StringData sd = new StringData(s);
		
		do {
			System.out.println("case 1: calculate length of string");
			System.out.println("case 2:convert lower to uppercase");
			System.out.println("case 3: Reverse the String");
			System.out.println("case 4: Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Length of String = "+sd.getLength());
				
				break;
			case 2:
				System.out.println("Uppercase = "+sd.getConcat());
				break;
			case 3:
				System.out.println("Reverse  = "+sd.getRev());
				break;
			case 4:
				System.exit(0);
				break;
				
				default:
					System.out.println("Invalid Input");
				
			}
		}while(true);
	}

}

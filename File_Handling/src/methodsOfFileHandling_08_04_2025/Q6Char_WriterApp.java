package methodsOfFileHandling_08_04_2025;
import java.io.*;
import java.util.*;
public class Q6Char_WriterApp {

	public static void main(String[] args) throws IOException {
	
		FileWriter f = new FileWriter("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter.txt",true);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		int i=0;
		while(i<=5) {
			char ch=sc.nextLine().charAt(0);
			
			f.write(ch);
			i++;
		}
		f.close();
		System.out.println("Data save successfully..");
	}

}

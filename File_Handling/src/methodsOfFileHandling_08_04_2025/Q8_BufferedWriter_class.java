package methodsOfFileHandling_08_04_2025;
import java.util.*;
import java.io.*;
public class Q8_BufferedWriter_class {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		Writer fw = new FileWriter("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter",true);
				
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("Enter the data");
		String s=sc.nextLine();
		
		bw.write(s);
		bw.newLine();
		bw.close();
		fw.close();
		
		System.out.println("Data added successfully");
	}

}

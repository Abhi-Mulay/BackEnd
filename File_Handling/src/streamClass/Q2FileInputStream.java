package streamClass;
import java.util.*;
import java.io.*;
public class Q2FileInputStream {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String directory = "D:\\Java_All_Programs\\File_Handling_All_File\\fileInputStreamFile.txt";
		
		try {
			FileInputStream fs = new FileInputStream(directory);
			
			int b;
			
			while((b=fs.read())!=-1) {
				
				System.out.print((char)b);
				b++;
			}
			fs.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}

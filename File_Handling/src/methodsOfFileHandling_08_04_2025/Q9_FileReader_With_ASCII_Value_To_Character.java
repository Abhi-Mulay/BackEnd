package methodsOfFileHandling_08_04_2025;
import java.util.*;
import java.io.*;

public class Q9_FileReader_With_ASCII_Value_To_Character {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		FileReader fr = new FileReader("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter");
		
		BufferedReader br = new BufferedReader(fr);
		String data;
		
		while((data=br.readLine())!=null) {
			System.out.print(data);
			Thread.sleep(3000);
		}
	}

}

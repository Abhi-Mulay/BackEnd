package date07_04_2025;
import java.util.*;
import java.io.*;
public class File_1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter.txt");
		
		f.createNewFile();

		/*try {
		 * 
		 // creating a file
		 
			File f = new File("D:\\Java_All_Programs\\File_Handling_All_File\\FilFirst.txt");
			
			f.createNewFile();
			
			//Writing a file
///
//			FileWriter filewriter= new FileWriter("D:\\Java_All_Programs\\File_Handling_All_File\\FilFirst.txt");
//			filewriter.write("om sai ram");
//			filewriter.close();
			
			// Reading file
			
			File filereader = new File("D:\\Java_All_Programs\\File_Handling_All_File\\FilFirst.txt");
			
			Scanner sc = new Scanner(filereader);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch(IOException e) {
			System.out.println("Some problem is there");
			System.out.println(e);
		}*/
		
//		// Deleting a file
//		File file = new File("D:\\Java_All_Programs\\File_Handling_All_File\\FilFirst.txt");
//		
//		if(file.delete()) {
//			System.out.println("File has been deleted successfully");
//		}
//		else {
//			System.out.println("Some problem is there");
//		}
		
	}

}

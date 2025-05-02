package methodsOfFileHandling_08_04_2025;
import java.util.*;
import java.io.*;
public class Q7_Writing_specified_data_in_file_from_string {

	private static Object finaly;

	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);
		
		try {
			FileWriter fw = new FileWriter("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter",true);
			
			System.out.println("Enter the data");
			
			
			while(true) {
				String s=sc.nextLine();
				if(s.equals("exit")) {
					fw.close();
					break;
				}
				else {
					
					fw.write(s,5,10);
				}
			}
		}
		catch(IOException e) {
			System.out.println("Exception"+e);
		}
		finally{
			System.out.println("File data saved");
		}
		}

}


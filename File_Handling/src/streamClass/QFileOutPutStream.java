package streamClass;
import java.util.*;
import java.io.*;
public class QFileOutPutStream {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String directory="D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter.txt";
		
		System.out.println("Enter the String");
		String str=sc.nextLine();
		try{
			FileOutputStream fs = new FileOutputStream(directory);// this method is use for write the data in file in byte format 
				fs.write(str.getBytes());// in this method we convert our data String to byte 
				fs.close();//this method is use for close the file
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
	}

}

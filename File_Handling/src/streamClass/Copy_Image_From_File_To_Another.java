package streamClass;
import java.util.*;
import java.io.*;

public class Copy_Image_From_File_To_Another {

	public static void main(String[] args) {
	
		try {
			FileInputStream finput= new FileInputStream("C:\\Users\\Asus\\OneDrive\\Pictures\\shambuRaje.jpg");//this constructor accepts the file path using string format
			
			FileOutputStream foutput = new FileOutputStream("D:\\Java_All_Programs\\File_Handling_All_File\\shiv.jpg");// this constructor accepts the file path using string format
			
			int data;
			
			while((data=finput.read())!=-1) {
				foutput.write(data);//here we copy our data to the othere file
				data++;
			}
			foutput.close();
			finput.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Code Run successfully...");
		}
	
	}

}

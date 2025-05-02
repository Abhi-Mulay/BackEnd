package streamClass;
import java.util.*;
import java.io.*;

public class Q4_Copy_Video_From_One_File_To_Another_File {

	public static void main(String[] args) {
		try {
			FileInputStream finput= new FileInputStream("D:\\omkarTemkar.mp4");
			
			FileOutputStream foutput = new FileOutputStream("D:\\Java_All_Programs\\File_Handling_All_File\\omkarTemkar.mp4");
			
			int data;
			
			while((data=finput.read())!=-1) {
				foutput.write(data);
				data++;
			}
			foutput.close();
			finput.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Data add successfully...");
		}
	}

}

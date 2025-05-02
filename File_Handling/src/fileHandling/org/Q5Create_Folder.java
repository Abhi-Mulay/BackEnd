package fileHandling.org;
import java.io.*;

public class Q5Create_Folder {

	public static void main(String[] args) {

		File f=new File("D:\\Java_All_Programs\\File_Handling\\filehandling1");
		
		boolean b=f.mkdir();
		
		if(b)
		{
			System.out.println("File has created successfully");
		}
		else {
			System.out.println("Some problem is there");
		}
		
		
	}

}

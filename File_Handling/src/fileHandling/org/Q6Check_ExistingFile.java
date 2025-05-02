package fileHandling.org;
import java.io.*;

public class Q6Check_ExistingFile {

	public static void main(String[] args) {
		
		File f= new File("D:\\Java_All_Programs\\File_Handling\\filehandling1");
		
		if(f.exists())
		{
			System.out.println("File olready Exists");
		}
		else {
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("File has created successfully");
			}
			else {
				System.out.println("some problem is there");
			}
		}
		
	}

}

package fileHandling.org;
import java.io.*;

public class Q7Fetch_All_File_From_Specificed_Drive {

	public static void main(String[] args)throws Exception 
	{
		
		File f = new File("D:\\Java_All_Programs\\");
		
		File list[]=f.listFiles();
		
		for(int i=0 ;i<list.length;i++)
		{
			System.out.println(list[i]);
		}
	}

}

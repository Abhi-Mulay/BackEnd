package methodsOfFileHandling_08_04_2025;

import java.util.*;
import java.io.*;
public class Q2File_Exist_Method {

	public static void main(String[] args) {
		
File f = new File("D:\\Java_All_Programs\\File_Handling_All_File\\firstMkdir");
		
		boolean b=f.exists();
		if(b) {
			System.out.println("File allready Exists");
		}
		else {
			System.out.println("File not found");
		}
	}

}

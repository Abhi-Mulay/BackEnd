package methodsOfFileHandling_08_04_2025;


import java.util.*;
import java.io.*;

public class Q3_ListFile_Method {

	public static void main(String[] args) {
		
		File f = new File("D:\\Java_All_Programs\\File_Handling_All_File");
		
		File list[]=f.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}

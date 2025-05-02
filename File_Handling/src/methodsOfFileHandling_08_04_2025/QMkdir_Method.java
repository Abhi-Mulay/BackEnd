package methodsOfFileHandling_08_04_2025;

import java.io.*;
import java.util.*;

public class QMkdir_Method {

	public static void main(String[] args) {
		
		File f = new File("D:\\Java_All_Programs\\File_Handling_All_File\\firstMkdir");
		
		boolean b=f.mkdir();//this mkdir() method is create a folder
		if(b) {
			System.out.println("Folder Created Successfully....😊");
		}
		else {
			System.out.println("some proble is there");
		}
	}

}

package methodsOfFileHandling_08_04_2025;
import java.io.*;
import java.util.*;
public class Q5_isDirectory_Check_Folder_Or_Not {

	public static void main(String[] args) {
		
		File f = new File("D:\\java");

		File []list=f.listFiles();
		
//		for check the how many file are there
//		for (int i = 0; i < list.length; i++) {
//			if(list[i].isFile()) {
//				System.out.println("Folder "+list[i]);
//			}
//		}
		
//		for check the how many folder are there
		for (int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println("Folder "+list[i]);
			}
		}
	}
}

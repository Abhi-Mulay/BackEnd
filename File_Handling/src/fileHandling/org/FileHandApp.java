package fileHandling.org;
import java.io.*;

public class FileHandApp {

	public static void main(String[] args) {
		
		File f = new File("");
		
		String absPath=f.getAbsolutePath();
		
		System.out.print(absPath);
				
	}

}

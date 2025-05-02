package fileHandling.org;
import java.io.*;

public class Q4Space {

	public static void main(String[] args) {

		File drives[]=File.listRoots();
		for(int i=0;i<drives.length;i++)
		{
			long totalSpace=drives[i].getTotalSpace();
			long freeSpace=drives[i].getFreeSpace();
			System.out.println(drives[i]+"\t"+totalSpace+"\t"+freeSpace);
		}
		
	}

}

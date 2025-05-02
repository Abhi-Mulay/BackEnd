package fileHandling.org;

import java.io.File;

public class Q3 {

	public static void main(String[] args) {
		
		File drives[]=File.listRoots();
		
		for(int i=0;i<drives.length;i++)
		{
			System.out.println(drives[i]);
		}
		
	}

}

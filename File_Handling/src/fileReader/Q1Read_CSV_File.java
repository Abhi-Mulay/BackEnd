package fileReader;
import java.util.*;
import java.io.*;

public class Q1Read_CSV_File {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		FileReader f = new FileReader("D:\\Java_All_Programs\\File_Handling_All_File\\test.csv");
		
		BufferedReader br = new BufferedReader(f);

		String line;
		
		while((line=br.readLine())!=null) {
			String ch[]=line.split(",");
			
			for(String col: ch) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
		br.close();
		f.close();
	}

}

package fileWriter;
import java.util.*;
import java.io.*;
public class Q1_Write_CSV_File {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {

			FileWriter fw = new FileWriter("D:\\Java_All_Programs\\File_Handling_All_File\\test.csv");
			
			
			BufferedWriter bw = new BufferedWriter(fw);
			int i=0;
			System.out.println("write the data");
			while(i<=5)
			{
				bw.write(sc.nextLine());
				bw.newLine();
				i++;
			}
			bw.close();
			fw.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally{
			System.out.println("Data Write Successfully");
		}
	}

}

	package serialization_Dserialization.org;
	import java.util.*;
	import java.io.*;
	
public class Q2_DSerializedApp_Read_file
{
		public static void main(String[] args)throws Exception {
			
			Scanner sc = new Scanner(System.in);
			
			try {
				FileInputStream fin  =new FileInputStream("D:\\Java_All_Programs\\File_Handling_All_File\\WriteCharacter.txt");
				
				ObjectInputStream Oin = new ObjectInputStream(fin);
				
//				Object obj =Oin.readObject(); if want only single data at a time then we use this method
				int i=1;
				
				while(true) {
					try {
						Employee e = (Employee)Oin.readObject();// if want multipulle data at a time then we use this method
						System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
						
					}
					catch(Exception ex) {
						Oin.close();
						fin.close();
					}
				}

			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			finally {
				System.out.println("File read Successfully");
			}
		}

}


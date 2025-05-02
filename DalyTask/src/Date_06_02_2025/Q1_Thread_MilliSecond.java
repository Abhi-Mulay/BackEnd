/*Q1. WAP to create thread using Thread class and display five values with a difference 
 * of 10000 milliseconds time slot?*/
package Date_06_02_2025;
import java.util.*;
class MyThread extends Thread
{
	public void display()
	{
		try {
			for(int i=0;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex){
			System.out.println("exception "+ex);
		}
	}
}
public class Q1_Thread_MilliSecond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MyThread m = new MyThread();
		m.display();
		
		
	}

}

package ThreadClass;
import java.util.*;
class MyThread extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				sleep(1000);
				System.out.println(i);
			}
		}
			catch(Exception ex)
			{
				System.out.println("error"+ex);
			}
		
	}
}
class MyThread1 extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				sleep(4000);
				System.out.println("one"+i);
			}
		}
			catch(Exception ex)
			{
				System.out.println("error"+ex);
			}
		
	}
}
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MyThread m1=new MyThread();
		m1.start();
		
		MyThread1 m2=new MyThread1();
		m2.start();
		
	}

}

//Q2. WAP to demonstrate the use of join() ,sleep(),isAlive(),stop() methods?

package Date_06_02_2025;
import java.lang.*;
//MyThread is Thread in program

class MyThread2 extends Thread
{   public void run()
 { try
   {
	for(int i=1; i<=5;i++)
	{ System.out.printf("Second Thread =%d\t%b\n",i,isAlive());
	   sleep(1000);
	}
   }
   catch(Exception ex)
   { System.out.println("Error is "+ex);
   }
 }
}
class MyThread1 extends Thread
{   public void run()
 { try
   {
	for(int i=1; i<=5;i++)
	{
	  System.out.printf("First Thread =%d\t%b\n",i,isAlive());
		if(i==3)
		{ stop();
		}
	     sleep(10000);
		
	}
   }
   catch(Exception ex)
   { System.out.println("Error is "+ex);
   }
 }	
}
public class Q2_Thread_Ues_Join_Sleep_ISAlive__Stop {

	   public static void main(String x[])throws InterruptedException
	    {
		MyThread1 m = new MyThread1();
		m.start(); //call run() internally 
		m.join();
		System.out.println("Now status of first thread is  "+m.isAlive());
		MyThread2 m1 = new MyThread2();
		m1.start();
	    }

}

package ThreadClass;
class MyStop1 extends Thread{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("First Thread= "+i+""+isAlive());
				if(i==3)
				{
					stop();
				}	
				
				sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}	
}
class MyStop2 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("Second Thread= "+i+""+isAlive());
				
				sleep(1000);
				
			}	
		}
		catch(Exception ex)
		{
			System.out.println(ex); 
		}
	}
}
public class StopMethod {

	public static void main(String[] args) throws InterruptedException {
		
		MyStop1 m=new MyStop1();
		m.start();
		m.run();
		MyStop2 m2=new MyStop2();
		m2.run();
		
	}

}

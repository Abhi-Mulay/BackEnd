package synchronization.org;

public class MyCounter extends Thread{

	private Counter counter;
	
	public MyCounter(Counter counter)
	{
		this.counter=counter;
	}
	
	public void run()
	{
		
			for(int i=1;i<=10;i++)
			{
				counter.increment();
			}
		
	}
	
	
}

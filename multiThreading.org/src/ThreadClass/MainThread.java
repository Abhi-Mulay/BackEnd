package ThreadClass;

public class MainThread {

	public static void main(String[] args) {
		
		Thread t=Thread.currentThread();
		String tname=t.getName();
		
		System.out.println("Current thread name is "+tname);
		
	}

}

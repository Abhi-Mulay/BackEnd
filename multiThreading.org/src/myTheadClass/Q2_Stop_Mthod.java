package myTheadClass;
class S1 extends Thread
{
	public void run() {
		try {
			for (int i = 1; i <=10; i++) {
				System.out.println(i*5);
//				System.out.println("Thread is alive"+isAlive());
				
				if(i==3) {
					stop();
				}
				
				sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class S2 extends Thread
{
	public void run() {
		try {
			for (int i = 1; i <=10; i++) {
				System.out.println(i*4);
				sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Q2_Stop_Mthod {

	public static void main(String[] args) throws Exception{
		
		S1 s1 = new S1();
		s1.run();
		s1.join();
		System.out.println("Thread is alive"+s1.isAlive());
		
		S2 s2 = new S2();
		s2.run();
	}

}

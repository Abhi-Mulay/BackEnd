package myTheadClass;

class MyThread extends Thread
{
	public void run() {
		try {
			for (int i = 1; i <=10; i++) {
				System.out.println(i*5);
				sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class MyThread1 extends Thread
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
public class Q1_MyThreadApp {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread();
		mt1.start();
		MyThread1 mt2 = new MyThread1();
		mt2.start();
	}

}

package synchronization.org;
import java.util.*;
class Tab{
	synchronized void showTable(int x) {
		try {
			for(int i=1;i<=5;i++) {
				
				System.out.println(x+"x"+i+"="+(i*x));
				if(i==5) {
					wait();
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex) {
			System.out.println("Error is "+ex);
		}
	}
		synchronized void recall() {
			try {
				notifyAll();
			}
			catch(Exception ex) {
				System.out.println(ex);
			}
		}
}
class T2 extends Thread{
	Tab table;
	public void setTable(Tab table){
		this.table=table;
	}
	public void run() {
		table.showTable(5);
	}
}
class T3 extends Thread{
	Tab table;
	public void setTable(Tab table){
		this.table=table;
	}
	
	public void run() {
		table.showTable(4);
	}
}

public class WaitNotifyApp {

	public static void main(String[] args) {
		
		Tab t=new Tab();
		
		T2 t2 = new T2();
		t2.setTable(t);
		t2.start();
		
		T3 t3 = new T3();
		t3.setTable(t);
		t3.start();
		
		do {
			Scanner sc = new Scanner(System.in);
		
			String mess=sc.nextLine();
			if(mess.equals("restart")){
				t.recall();
			}
			t.recall();
		}while(true);
	}
}

package myTheadClass;
class Table
{
	synchronized void showTable(int n) {
		try {
			for (int i = 1; i <=10; i++) {
				
				System.out.println(n*i);
				Thread.sleep(1000);

			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

class Second extends Thread
{
	Table table;
	
	public void setTable(Table table) {
		this.table=table;
	}
	
	public void run() {
		table.showTable(3);
	}
}

class Three  extends Thread
{
	Table table;
	public void setTable(Table table) {
		this.table=table;
	}
	
	public void run() {
		table.showTable(7);
	}
}
public class Syncronys_Asyncronys {

	public static void main(String[] args) {
		Table tt = new Table();
		
		Second t1 = new Second();
		t1.setTable(tt);
		t1.start();
		
		Three t2  = new Three();
		t2.setTable(tt);
		t2.start();
	}

}

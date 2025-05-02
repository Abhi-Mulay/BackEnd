package synchronization.org;
class Table{
	synchronized void showTable(int n) {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(n+"x"+i+"="+n*i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("error is "+ex);
		}
	}
}

class Two extends Thread{
	Table table;
	void setTable(Table table) {
		this.table=table;
	}
	public void run() {
		table.showTable(2);
	}
}

class Three extends Thread{
	Table table;
	void setTable(Table table) {
		this.table=table;
	}
	public void run() {
		table.showTable(3);
	}
}

public class SyncAsyncApp {

	public static void main(String[] args) {
		Table t = new Table();
		
		Two two=new Two();
		two.setTable(t);
		two.start();
		
		Three three = new Three();
		three.setTable(t);//allocate resource to thread
		three.start();//start thread execution
		
	}

}

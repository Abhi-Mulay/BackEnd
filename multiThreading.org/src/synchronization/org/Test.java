package synchronization.org;

public class Test {

	public static void main(String[] args) {

		Counter counter = new Counter();

		MyCounter m1 = new MyCounter(counter);

		MyCounter m2 = new MyCounter(counter);

		m1.start();
		m2.start();
		try {
			m1.join();
			m2.join();
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(counter.getCount());

	}

}

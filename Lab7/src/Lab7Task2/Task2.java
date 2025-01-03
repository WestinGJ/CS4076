package Lab7Task2;
/**
*
* @author Westin Gjervold
*/
public class Task2 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(counter, "Thread One");
		Thread t2 = new Thread(counter, "Thread Two");
		Thread t3 = new Thread(counter, "Thread Three");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package Lab7Task2;
/**
*
* @author Westin Gjervold
*/
public class Counter implements Runnable {
	private int c = 0;

	public synchronized void increment() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public int getValue() {
		return c;
	}

	@Override
	public void run() {
		// incrementing
		increment();
		System.out.println("Counter value for " + Thread.currentThread().getName() + " after increment is " + this.getValue());
		// decrementing
		decrement();
		System.out.println("Counter value at the end for " + Thread.currentThread().getName() + " is " + this.getValue());

	}
}

/**
 * Lab 6 Task 4
 * 
 * @author Westin Gjervold
 */
public class Lab6Task4 {
	public static void main(String[] args) {
		// Create threads
		Thread thread1 = new Thread(new PrintChar('a', 100));
		Thread thread2 = new Thread(new PrintChar('b', 100));
		Thread thread3 = new Thread(new PrintNumbers(100));
		// Run threads
		thread1.start();
		thread2.start();
		thread3.start();
	}

	static class PrintChar implements Runnable {
		private char charToPrint;
		private int times;

		public PrintChar(char c, int t) {
			charToPrint = c;
			times = t;
		}

		public void run() {
			for (int i = 0; i < times; i++) {
				System.out.println(charToPrint);
			}
		}
	}

	static class PrintNumbers implements Runnable {
		private int times;

		public PrintNumbers(int t) {
			times = t;
		}

		public void run() {
			for (int i = 1; i <= times; i++) {
				System.out.println(i + " ");
			}
		}
	}
}
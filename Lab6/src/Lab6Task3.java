/**
 * Lab 6 Task 3
 * 
 * @author Westin Gjervold
 */
public class Lab6Task3 {
	public static void main(String[] args) {
		// Create threads
		Thread thread1 = new Thread(new PrintWord("Westin", 4));
		Thread thread2 = new Thread(new PrintWord("Gjervold", 4));
		// Set priorities for threads
		thread1.setPriority(1);
		thread2.setPriority(2);
		// Start threads
		thread2.start();
		thread1.start();
	}

	static class PrintWord implements Runnable {
		private String word;
		private int times;

		public PrintWord(String word, int times) {
			this.word = word;
			this.times = times;
		}

		public void run() {
			for (int i = 0; i < times; i++) {
				System.out.println(word);
			}
		}
	}
}
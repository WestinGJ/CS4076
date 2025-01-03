import java.util.Scanner;

/**
 * Lab 6 Task 5
 * 
 * @author Westin Gjervold
 */
public class Lab6Task5 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How the should each thread sleep for (in milliseconds): ");
		int sleepTime = userInput.nextInt();
		userInput.close();
		System.out.println("Creating 1000 threads with sleep time: " + sleepTime + " milliseconds");
		Thread[] threads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			threads[i] = new Thread(new Sleeper(sleepTime));
			threads[i].start();
			System.out.println("Number of active threads: " + Thread.activeCount());
		}
	}

	static class Sleeper implements Runnable {
		private int sleepTime;

		public Sleeper(int sleepTime) {
			this.sleepTime = sleepTime;
		}

		public void run() {
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
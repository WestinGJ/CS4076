import java.util.Scanner;

/**
 * Lab 6 Task 2
 * 
 * @author Westin Gjervold
 */
public class Lab6Task2 {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many threads do you want to create: ");
		int numberOfThreads = userInput.nextInt();
		userInput.close();
		for (int i = 0; i < numberOfThreads; i++) {
			Thread ExampleThread = new Thread(new ExampleThread());
			ExampleThread.setName("T" + (i + 1));
			ExampleThread.start();
		}
	}

	static class ExampleThread implements Runnable {
		public void run() {
			Thread currentThread = Thread.currentThread();
			System.out.println("Thread Name: " + currentThread.getName());
		}
	}
}
/**
 * Lab 6 Task 1
 * 
 * @author Westin Gjervold
 */
public class Lab6Task1 {
	public static void main(String[] args) {
		Thread ExampleThread1 = new Thread(new ExampleThread());
		Thread ExampleThread2 = new Thread(new ExampleThread());
		Thread ExampleThread3 = new Thread(new ExampleThread());
		Thread ExampleThread4 = new Thread(new ExampleThread());
		Thread ExampleThread5 = new Thread(new ExampleThread());
		Thread ExampleThread6 = new Thread(new ExampleThread());
		Thread ExampleThread7 = new Thread(new ExampleThread());
		Thread ExampleThread8 = new Thread(new ExampleThread());
		Thread ExampleThread9 = new Thread(new ExampleThread());
		Thread ExampleThread10 = new Thread(new ExampleThread());
		ExampleThread1.start();
		ExampleThread2.start();
		ExampleThread3.start();
		ExampleThread4.start();
		ExampleThread5.start();
		ExampleThread6.start();
		ExampleThread7.start();
		ExampleThread8.start();
		ExampleThread9.start();
		ExampleThread10.start();
	}

	static class ExampleThread implements Runnable {
		public void run() {
			Thread currentThread = Thread.currentThread();
			System.out.println("Thread ID: " + currentThread.getId() + ", Name: " + currentThread.getName());
		}
	}
}
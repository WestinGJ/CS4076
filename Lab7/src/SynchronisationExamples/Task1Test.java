package SynchronisationExamples;
/**
*
* @author Westin Gjervold
*/
public class Task1Test {
	public static void main(String args[]) {
		Task1Thread resource = new Task1Thread();
		Thread t1 = new Thread(resource);
		Thread t2 = new Thread(resource);
		Thread t3 = new Thread(resource);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t2.start();
		t3.start();
	}
}

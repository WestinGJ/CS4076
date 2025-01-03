package CubbyHole_Synchronized;

/**
 *
 * @author razi
 */

// Synchronized CubbyHole.
public class CubbyHole {
    private int contents;
    private boolean available = false;

    public synchronized int get(int who) {
    while (this.available == false) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    this.available = false;
    System.out.println("Consumer " + who + " is getting: " + this.contents);
    notifyAll();
    return this.contents;
  }

  public synchronized void put(int who, int value) {
    while (this.available == true) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    this.contents = value;
    this.available = true;
    System.out.println("Producer " + who + " is putting: " + this.contents);
    notifyAll();
  }
}


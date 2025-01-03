package CubbyHole_Synchronized;

/**
 *
 * @author razi
 */
public class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Consumer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get(this.number);
            System.out.println("Consumer #" + this.number
                               + " HAS GOTTEN: " + value);
        }
    }

}

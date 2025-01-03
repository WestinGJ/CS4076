package CubbyHole;

/**
*
* @author razi
*/
public class Task9 {
   
   public static void main(String[] args) {
      
       CubbyHole c = new CubbyHole();
      
       Producer p1 = new Producer(c, 1);
       Consumer c1 = new Consumer(c, 1);

       p1.start();
       c1.start();
   }
}

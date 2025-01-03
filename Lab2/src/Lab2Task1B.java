import java.net.*;

/**
 * Lab 2 Task 1 Part B
 *
 * @author Westin Gjervold
 */
public class Lab2Task1B {
    public static void main(String[] args) {
        System.out.println("Looking up the IP address this machine.");
        try {
            InetAddress ipAddress = InetAddress.getLocalHost ();
            System.out.println("IP address of this machine: "+ ipAddress.getHostAddress ());
        } 
        catch ( Exception ex ) {
            System.out.println ("Error - unable to find IP address of this machine");
        }
    }
}
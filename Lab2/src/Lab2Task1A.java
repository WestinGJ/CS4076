import java.net.*;
import java.io.*;

/**
 * Lab 2 Task 1 Part A
 *
 * @author Westin Gjervold
 */
public class Lab2Task1A {
    public static void main(String[] args) {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print ("Enter host name: ");
        try {
            String hostName = userInput.readLine();
            InetAddress ipAddress = InetAddress.getByName(hostName);
            System.out.println("IP address: " + ipAddress.toString());
        }
        catch (Exception e) {  
            System.err.println(e);  
        }  
    }      
}

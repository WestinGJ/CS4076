import java.io.*;
import java.net.*;

public class TCPEchoServer {
    private static ServerSocket servSock;
    private static final int PORT = 1234;
    private static int clientConnections = 0;

    public static void main(String[] args) {
        System.out.println("Opening port...\n");
        try {
            servSock = new ServerSocket(PORT);      //Step 1.
        } catch (IOException e) {
            System.out.println("Unable to attach to port!");
            System.exit(1);
        }

        while (true) {
            try {
                Socket link = servSock.accept();
                clientConnections++;
                Thread clientThread = new Thread(new ClientHandler(link));
                clientThread.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class ClientHandler implements Runnable {
        private Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Message received from client: " + clientConnections + "  "+ message);
                    out.println("Response from Server (Capitalized Message): " + message.toUpperCase());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    System.out.println("\n* Closing connection... *");
                    clientSocket.close();
                } catch (IOException e) {
                    System.out.println("Unable to disconnect!");
                    e.printStackTrace();
                }
            }
        }
    }
}

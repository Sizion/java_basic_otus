package home_work_13.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    private static final int PORT = 8081;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String userInput;

            try (Socket socket = new Socket(HOST, PORT)) {
                Client client = new Client(socket.getInputStream(), socket.getOutputStream());

                //client.read(socket);

                client.read(socket);


                // System.out.println("Need chose operator");
                userInput = scanner.nextLine() +"\r\n";


                client.sent(userInput.getBytes());
                System.out.println("Sent to server");


            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
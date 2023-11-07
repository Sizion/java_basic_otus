package home_work_13.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    private static final int PORT = 8081;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket(HOST, PORT);
             DataInputStream in = new DataInputStream(socket.getInputStream());
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        ) {
            System.out.println(in.readUTF()); //Hello
            System.out.println(in.readUTF()); //Enter first value
            out.writeFloat(scanner.nextInt());
            System.out.println(in.readUTF()); //Enter second value
            out.writeFloat(scanner.nextInt());
            System.out.println(in.readUTF() + " from server"); //Enter operation

            out.writeUTF(scanner.next());
            System.out.println( in.readUTF());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

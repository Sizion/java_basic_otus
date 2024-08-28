package home_work_13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    private static final int PORT = 8081;
    private static final String HOST = "localhost";
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        try (Socket socket = serverSocket.accept();
        ) {

            try (DataInputStream in = new DataInputStream(socket.getInputStream());
                 DataOutputStream out = new DataOutputStream(socket.getOutputStream());) {


                out.writeUTF("Hello, im' calculate\r\nChose 2 numbers and operation * + - /");
                out.writeUTF("Enter first value");
                float val1 = in.readInt();
                System.out.println("val1 = " + val1);
                out.writeUTF("Enter second value");
                float val2 = in.readInt();
                System.out.println("val1 = " + val2);
                out.writeUTF("Enter operation");
                String operation = in.readUTF();

                switch (operation) {
                    case ("+"):
                        out.writeUTF("Result = " + (val1 + val2));
                        break;
                    case ("-"):
                        out.writeUTF("Result = " + (val1 - val2));
                        break;
                    case ("*"):
                        out.writeUTF("Result = " + (val1 * val2));
                        break;
                    case ("/"):
                        out.writeUTF("Result = " + (val1 / val2));
                        break;
                    default:
                        out.writeUTF("Incorrect operation");
                        out.flush();
                }

            }
        }
    }


}

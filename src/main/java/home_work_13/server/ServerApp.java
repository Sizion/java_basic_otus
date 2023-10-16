package org.example.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ServerApp {

    private static final int PORT = 8081;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            //Hello message
            sendHello(socket);

            parseOperator(socket);

        }
    }

    private static void readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            String str = reader.readLine();
            System.out.println(str);
            if (str == null || str.trim().isEmpty()) {
                break;
            }
        }
    }

    private static void sendHello(Socket socket) throws IOException {
        OutputStream out = socket.getOutputStream();
        String str = "Hello\r\nYou need chose operator\r\n+ - * /\r\nAfter this chose 2 numbers+ \n";
        out.write(str.getBytes());
        out.flush();
    }

    private static void parseOperator(Socket socket) throws IOException {
        System.out.println("Enter in parseOperator");
        OutputStream out = socket.getOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String[] inputCalculate = reader.lines().collect(Collectors.joining()).split(" ");
        System.out.println(Arrays.toString(inputCalculate));
        int val1 = Integer.parseInt(inputCalculate[0]);
        int val2 = Integer.parseInt(inputCalculate[1]);

        switch (inputCalculate[2]) {
            case ("+"):
                out.write("3".getBytes());
                break;
            case ("-"):
                out.write(("Резульат " + (val1 - val2)).getBytes());
                break;
            case ("/"):
                out.write(("Резульат " + (val1 / val2)).getBytes());
                break;
            case ("*"):
                out.write(("Резульат " + (val1 * val2)).getBytes());
                break;
            default:
                out.write("Выберите корректный оператор".getBytes());
        }
        out.flush();

    }

}

package home_work_13.client;

import java.io.*;
import java.net.Socket;

public class Client implements AutoCloseable {

    private DataInputStream in;
    private DataOutputStream out;

    public Client(InputStream in, OutputStream out) {
        this.in = new DataInputStream(new BufferedInputStream(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }

    public void sent(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();
    }

    public void read(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {

            String str = reader.readLine();
            System.out.println(str);
            if (str == null || str.trim().isEmpty()) {
                break;
            }
        }
        System.out.println("End message from server");
    }

    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }
}

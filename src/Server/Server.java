package Server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9000);
        System.out.println("The server side socket created and is ready to listen to requests from the Loopback Network Interface");
        Socket s = socket.accept();

        InputStream inputStream = s.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        if (s != null) {
            System.out.println(bufferedInputStream.read());
        }
    }
}

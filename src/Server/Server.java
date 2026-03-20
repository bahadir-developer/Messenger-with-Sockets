package Server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        socket.bind(socketAddress);

        System.out.println("The Server Side Socket created");
        Socket s = socket.accept();

        InputStream inputStream = s.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        if (s != null) {
            System.out.println(bufferedInputStream.read());
        }

        bufferedInputStream.close();
        socket.close();
    }
}

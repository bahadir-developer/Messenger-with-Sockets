package Server;

import java.io.*;
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

        while(true){
            Socket s = socket.accept();
            InputStream inputStream = s.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println(bufferedReader.read());
        }
    }
}

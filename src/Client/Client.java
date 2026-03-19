package Client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 9000);
        socket.connect(socketAddress, 60);
        System.out.println("Client side socket created");

        if (socket.isConnected()) {
            System.out.println("Client side socket connected");
        }

        System.out.println("Enter the message:");
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        socket.close();
    }
}

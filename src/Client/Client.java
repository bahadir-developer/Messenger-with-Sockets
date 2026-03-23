package Client;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        socket.connect(socketAddress, 15);
        System.out.println("Client Side Socket created");

        if (socket.isConnected()) {
            System.out.println("Client Side Socket connected");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message:");
        String message = scanner.next();

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.write(message);
//
//        socket.close();
    }
}

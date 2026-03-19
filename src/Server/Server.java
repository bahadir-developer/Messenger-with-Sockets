package Server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        Socket s = null;
        ServerSocket socket = new ServerSocket(9000);
        s = socket.accept();

        InputStream inputStream = new Inp
        if(s != null){

        }
    }
}

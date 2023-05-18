package MultiCastSocket;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {
        try {
            InetAddress address = InetAddress.getByName("224.0.0.1");
            byte[] buffer = new byte[1024];
            MulticastSocket socket = new MulticastSocket(1234);
            socket.joinGroup(address);
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String data = new String(buffer, 0, buffer.length);
                System.out.println("Received data " + data);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

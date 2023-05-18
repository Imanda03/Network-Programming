package MultiCastSocket;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            InetAddress address = InetAddress.getByName("224.0.0.1");
            DatagramSocket socket = new DatagramSocket();
            for (int i = 0; i <= 3; i++) {
                String data = "Hello, " + i + "!";
                DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, address, 12345);
                socket.send(packet);
                System.out.println("Data sent: " + data);
                Thread.sleep(1000);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

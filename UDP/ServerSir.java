package UDP;

import java.net.*;

public class ServerSir {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(1234);
            byte[] buffer;
            buffer = new byte[2];
            byte[] send = { 6, 9 };

            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);
            DatagramPacket senddp = new DatagramPacket(send, buffer.length, dp.getAddress(), dp.getPort());
            ds.send(senddp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
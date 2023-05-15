package UDP;

import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSir {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            int port = 1234;
            byte[] buffer = { 12, 13 };
            byte[] buffer1 = new byte[2];
            System.out.println(buffer1);
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length, address, port);
            DatagramPacket receivePacket = new DatagramPacket(buffer1, buffer1.length);
            ds.connect(address, port);
            System.out.println("Bound " + ds.isBound());
            System.out.println("Connected " + ds.isConnected());
            System.out.println("InetAddress " + ds.getInetAddress());
            System.out.println("Port " + ds.getPort());
            System.out.println("Remote Socket " + ds.getRemoteSocketAddress());
            System.out.println("Local Socket " + ds.getLocalSocketAddress());
            ds.send(dp);
            System.out.println("Data Packet Sent!");
            ds.receive(receivePacket);
            System.out.println("Data Packet Received: \n" + Arrays.toString(receivePacket.getData()));
            int num1 = receivePacket.getData()[0];
            int num2 = receivePacket.getData()[1];
            System.out.println(num1 + num2);
            System.out.println("Local Port " + ds.getLocalPort());
            ds.setSoTimeout(100);
            ds.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
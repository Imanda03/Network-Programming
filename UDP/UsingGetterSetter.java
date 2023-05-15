package UDP;

import java.io.IOException;
import java.net.*;

public class UsingGetterSetter {
    private DatagramSocket socket;
    private InetAddress address;

    public UsingGetterSetter() {
        try {
            socket = new DatagramSocket();
            address = InetAddress.getByName("localhost");
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void send(String message) {
        byte[] buffer = message.getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 5000);
        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String receive() {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        try {
            socket.receive(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(packet.getData(), 0, packet.getLength());
    }

    public DatagramSocket getSocket() {
        return socket;
    }

    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }

    public InetAddress getAddress() {
        return address;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public static void main(String[] args) {
        UsingGetterSetter udpExample = new UsingGetterSetter();
        udpExample.send("Hello, World!");
        udpExample.receive();
        System.out.println("Received message: " + udpExample.receive());
    }
}

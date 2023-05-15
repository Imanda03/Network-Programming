

import java.net.*;
import java.io.*;

public class Server implements Runnable{

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(12345);
            Socket client;
            System.out.println("Waiting for the cliet to connect");
            client = server.accept();
            DataOutputStream dos= new DataOutputStream(client.getOutputStream());
            DataInputStream dis = new DataInputStream(client.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while(true){
                str = dis.readUTF();
                System.out.println("client says: "+ str);
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    public static void main(String[] args) {
        Runnable r1 = new Server();
        Thread th1 = new Thread(r1, "Running");
        th1.run();
    }

}
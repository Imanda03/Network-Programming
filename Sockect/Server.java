package Sockect;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8000);
            Socket client;
            System.out.println("Waiting for the client to connect");
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
    }
}

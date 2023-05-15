package Sockect;

import java.net.*;
import java.io.*;

public class Client{
    public static void main(String[] args) {
        try {
            Socket client = new Socket("127.0.0.1", 8000);
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while(true){
                
                str = br.readLine();
                dos.writeUTF(str);
                dos.flush();
                str2 = dis.readUTF();
                System.out.println("Server says: "+ str2);
            }
        }
         catch (IOException e) {
            System.out.println(e);
        }
        
    }
}
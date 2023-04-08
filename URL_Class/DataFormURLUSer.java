package URL_Class;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class DataFormURLUSer {
    public static String printData(String text) throws IOException {
        URL url = new URL(text);
        URLConnection ucon = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(ucon.getInputStream()));
        String line;
        String data = "";
        while ((line = br.readLine()) != null) {
            data += line;
        }

        return data;

    }

}

class Program {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the URL:");
            String text = sc.nextLine();
            String content = DataFormURLUSer.printData(text);
            System.out.println(content);
            sc.close();
        } catch (Exception e) {
            System.out.println("Check your code" + e);
        }
    }
}

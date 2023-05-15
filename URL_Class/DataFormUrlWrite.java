package URL_Class;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class DataFormUrlWrite {

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

    public static void WritteData(String text) {
        try {
            String data = DataFormUrlWrite.printData(text);
            FileWriter writer = new FileWriter("URLText.html");
            writer.write(data);
            writer.close();
            System.out.println("CompletelyWrite");

        } catch (Exception e) {
            System.out.println("Error during writing a files");
        }
    }

}

class Program {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String content = DataFormUrlWrite.printData(text);
            System.out.println(content);
            DataFormUrlWrite.WritteData(text);
            sc.close();
        } catch (Exception e) {
            System.out.println("Check your code" + e);
        }
    }
}

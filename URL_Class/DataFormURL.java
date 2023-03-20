package URL_Class;

import java.net.*;
import java.io.*;
// import java.util.Scanner;

public class DataFormURL {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        try {

            URL url = new URL("www.google.com");
            URLConnection ucon = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(ucon.getInputStream()));
            String line;
            // sc.close();
            while ((line = br.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (Exception e) {
            System.out.println("Check your code" + e);
        }
    }
}

package URL_Class;

import java.net.*;

public class URL_program {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();

            System.out.println("The protocol is " + protocol);
            System.out.println("The host is " + host);
            System.out.println("The port is " + port);
        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
}

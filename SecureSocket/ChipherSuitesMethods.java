package SecureSocket;

import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import URL_Class.BufferReader;

public class ChipherSuitesMethods {
    public static void main(String[] args) {
        try {
            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) sf.createSocket("www.google.com",443);

            String[] cipherSuites = socket.getSupportedCipherSuites();
            System.out.println(socket.getEnabledCipherSuites());

            System.out.println(cipherSuites);
            System.out.println(socket.getRemoteSocketAddress());

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

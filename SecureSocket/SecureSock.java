package SecureSocket;

import java.net.*;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class SecureSock {
    public static void main(String[] args) {
        try {
            
            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket sls = (SSLSocket) sf.createSocket();
            sls.connect(new InetSocketAddress("localhost", 8081));
            System.out.println(sls.getEnabledCipherSuites());
            System.out.println(sls.getSupportedCipherSuites());
            System.out.println(sls.getRemoteSocketAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

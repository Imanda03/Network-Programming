package SecureSocket;

import java.net.*;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Suites {
    public static void main(String[] args) {
        try {
            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) sf.createSocket("www.google.com",440);

            String[] suits = ((SSLSocket) socket).getSupportedCipherSuites();
            ((SSLSocket) socket).setEnabledCipherSuites(suits);
            ((SSLSocket) socket).addHandshakeCompletedListener(new MyHandShake());
            ((SSLSocket) socket).startHandshake();
            System.out.println("Conntectd to: " + socket.getRemoteSocketAddress());

         } catch (Exception e) {
            System.out.println(e);
        }
    }

    
}

class MyHandShake implements HandshakeCompletedListener{
    public void handShakeCompleted(HandshakeCompletedEvent e){
        System.out.println("Session Info " + e.getSession());
    }

    @Override
    public void handshakeCompleted(HandshakeCompletedEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handshakeCompleted'");
    }
}
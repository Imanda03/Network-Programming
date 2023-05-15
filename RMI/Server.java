package RMI;

import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            Adder stub = new RemoteAdder();
            Naming.rebind("rmi://localhost:12345/nist", stub);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

package RMI;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Adder skleton = (Adder) Naming.lookup("rmi://localhost:12345/nist");
            System.out.println(skleton.add(1, 2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

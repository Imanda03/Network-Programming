package RMI;

import java.rmi.server.*;

public class RemoteAdder extends UnicastRemoteObject implements Adder {

    RemoteAdder() throws Exception {
    }

    public int add(int x, int y) {
        return x + y;
    }

}

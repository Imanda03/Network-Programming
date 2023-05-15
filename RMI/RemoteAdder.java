package RMI;

import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements Adder {

    RemoteAdder() throws Exception {
    }

    public int add(int x, int y) {
        return x + y;
    }

}

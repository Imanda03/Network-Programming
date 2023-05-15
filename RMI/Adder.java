package RMI;

import java.rmi.Remote;

public interface Adder extends Remote {
    public int add(int x, int y) throws Exception;
}

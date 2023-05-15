import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 12345);
        System.out.println("Connected to server");

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);

        Thread readThread = new Thread(() -> {
            try {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    String message = new String(buffer, 0, bytesRead);
                    System.out.print("client: "+ message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        readThread.start();

        while (true) {
            String message = scanner.nextLine();
            output.write(message.getBytes());
        }
    }
}

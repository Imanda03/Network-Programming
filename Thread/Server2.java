import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server2 {
    private static ArrayList<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Server started");

        while (true) {
            Socket client = server.accept();
            ClientHandler clientThread = new ClientHandler(client);
            clients.add(clientThread);
            clientThread.start();
        }
    }

    public static void broadcast(String message, ClientHandler sender) throws IOException {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.send(message);
            }
        }
    }

    static class ClientHandler extends Thread {
        private Socket client;
        private InputStream input;
        private OutputStream output;

        public ClientHandler(Socket socket) throws IOException {
            this.client = socket;
            this.input = client.getInputStream();
            this.output = client.getOutputStream();
        }

        public void run() {
            try {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    String message = new String(buffer, 0, bytesRead);
                    broadcast(message, this);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clients.remove(this);
                    client.close();
                    input.close();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void send(String message) throws IOException {
            output.write(message.getBytes());
        }
    }
}

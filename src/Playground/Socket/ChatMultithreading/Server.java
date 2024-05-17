package Playground.Socket.ChatMultithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import static Utilities.Helper.println;

public class Server {
    private final ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            closeServerSocket();
        }
    }

    private void closeServerSocket() {
        try {
            if (serverSocket != null) serverSocket.close();
        } catch (IOException ignore) { }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9898);
        Server server = new Server(serverSocket);
        server.startServer();
    }

    private static class ClientHandler implements Runnable {
        private static final ArrayList<ClientHandler> clientHandlers = new ArrayList<>();
        private Socket socket;
        private BufferedReader bufferedReader;
        private PrintWriter printWriter;
        private String username;

        public ClientHandler(Socket socket) {
            try {
                this.socket = socket;
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.printWriter = new PrintWriter(socket.getOutputStream(), true);
                this.username = bufferedReader.readLine();
                clientHandlers.add(this);
                println(username + " joined");
                broadcastMessage("Server: " + username + " joined");
            } catch (IOException e) {
                closeConnection(socket, bufferedReader, printWriter);
            }
        }

        private void broadcastMessage(String message) {
            for (ClientHandler clientHandler : clientHandlers) {
                if (!this.equals(clientHandler)) clientHandler.printWriter.println(message);
            }
        }

        private void closeConnection(Socket socket, BufferedReader bufferedReader, PrintWriter printWriter) {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            String clientMessage;
            while (socket.isConnected()) {
                try {
                    clientMessage = bufferedReader.readLine();
                    if (clientMessage.equals(":quit")) {
                        broadcastMessage(username + " left the chat");
                        println(username + " left");
                        clientHandlers.remove(this);
                        closeConnection(socket, bufferedReader, printWriter);
                    } else broadcastMessage(username + ": " + clientMessage);
                } catch (IOException e) {
                    closeConnection(socket, bufferedReader, printWriter);
                }
            }
        }
    }
}

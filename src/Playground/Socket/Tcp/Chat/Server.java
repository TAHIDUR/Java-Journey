package Playground.Socket.Tcp.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import static Utilities.Helper.println;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            println("Server started");
            Socket socket = serverSocket.accept();
            println("Client joined");
            String message;
            while (true) {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while ((message = in.readLine()) != null) {
                    println(message);
                }
            }
        } catch (IOException ignored) {

        }
    }
}

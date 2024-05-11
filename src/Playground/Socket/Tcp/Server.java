package Playground.Socket.Tcp;

import static Utilities.Helper.println;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        println("Server started......");
        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            println("Waiting for client .............");
            Socket socket = serverSocket.accept();
            println("Connection established");

            // Get client message from input stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            println(message);
        }
    }
}

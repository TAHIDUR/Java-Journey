package Playground.Socket.Tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

import static Utilities.Helper.println;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9999)) {
            println("Client started");
            // User input taken
            Scanner scanner = new Scanner(System.in);
            String message = scanner.nextLine();

            // sent message to server
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(message);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

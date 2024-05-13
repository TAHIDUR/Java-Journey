package Playground.Socket.Tcp.Chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9999)) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                String message = scanner.nextLine();

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println(message);
            }
        } catch (IOException ignored) {
        }
    }

}

package Playground.Socket.Tcp.Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static Utilities.Helper.print;

public class Client {

    private Socket socket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;
    private String username;

    public Client(Socket socket, String username) {
        try {
            this.socket = socket;
            this.username = username;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.printWriter = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            closeConnection(socket, bufferedReader, printWriter);
        }
    }


    public void sendMessage() {
        printWriter.println(username);
        Scanner scanner = new Scanner(System.in);
        while (socket.isConnected()) {
            String chatMessage = scanner.nextLine();
            printWriter.println(chatMessage);
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
        } catch (IOException ignore) {
        }
    }


    public void listenMessages() {
        new Thread(() -> {
            String chat;
            while (socket.isConnected()) {
                try {
                    chat = bufferedReader.readLine();
                    System.out.println(chat);
                } catch (IOException e) {
                    closeConnection(socket, bufferedReader, printWriter);
                }
            }
        }).start();
    }


    public static void main(String[] args) {
        try {
            print("Please enter your username: ");
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            Socket socket = new Socket("localhost", 9999);
            Client client = new Client(socket, username);
            client.listenMessages();
            client.sendMessage();
        } catch (IOException ignored) {
        }
    }

}

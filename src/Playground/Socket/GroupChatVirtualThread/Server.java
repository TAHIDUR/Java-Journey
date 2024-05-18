package Playground.Socket.GroupChatVirtualThread;

import java.util.concurrent.Executors;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<PrintWriter> printers = new ArrayList<>();

    public static void start(final int port) {
        try (var serverSocket = new ServerSocket(port)) {
            System.out.println("Server Started");
            try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
                while (true) {
                    var socket = serverSocket.accept();
                    var writer = new PrintWriter(socket.getOutputStream(), true);
                    executor.submit(() -> {
                        try (var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                            var username = reader.readLine();
                            System.out.println(STR."\{username} joined chat");
                            printers.add(writer);
                            for (String message; (message = reader.readLine()) != null; ) {
                                broadCastMessage(message, writer, username);
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void broadCastMessage(String message,PrintWriter sender, String username){
        for(var writer: printers){
            if(writer != sender) writer.println(STR."\{username}: \{message}");
        }
    }
}

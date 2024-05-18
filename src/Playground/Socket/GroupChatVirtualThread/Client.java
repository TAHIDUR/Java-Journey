package Playground.Socket.GroupChatVirtualThread;

import java.util.concurrent.Executors;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.net.Socket;

public class Client {
    public static void start(final int port, Scanner scanner) {
        try (var client = new Socket("localhost", port);
             var reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
             var writer = new PrintWriter(client.getOutputStream(), true)
        ) {
            System.out.print("Enter your username: ");
            var username = scanner.nextLine();
            writer.println(username);
            try (var executors = Executors.newVirtualThreadPerTaskExecutor()) {
                executors.submit(() -> {
                    for (String message; !(message = scanner.nextLine()).isEmpty(); ) {
                        writer.println(message);
                    }
                });
                executors.submit(() -> {
                    try {
                        for (String response; (response = reader.readLine()) != null; ) {
                            System.out.println(response);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

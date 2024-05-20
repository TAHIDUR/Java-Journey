package Playground.Socket.GroupChatVirtualThread;

import java.util.Scanner;

public class GroupChatVirtualThread {

    final int PORT = 9890;
    void main() {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Continue as Server ? Type y/n: ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                Server.start(PORT);
            } else {
                Client.start(PORT, scanner);
            }
        }
    }
}
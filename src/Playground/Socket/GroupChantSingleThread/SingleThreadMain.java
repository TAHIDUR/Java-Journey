package Playground.Socket.GroupChantSingleThread;

import Playground.Socket.Constants;

import java.util.Scanner;

public class SingleThreadMain {
    void main() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Continue as Server ? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                Server.start(Constants.PORT);
            } else {
                Client.start(Constants.PORT, scanner);
            }
        }
    }

}
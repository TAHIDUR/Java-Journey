import Playground.Socket.Constants;
import Playground.Socket.GroupChantSingleThread.Client;
import Playground.Socket.GroupChantSingleThread.Server;

import java.util.Scanner;

public static void main() {
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Continue as Server ? (y/n): ");
        if(scanner.nextLine().equalsIgnoreCase("y")){
            Server.start(Constants.PORT);
        }else{
            Client.start(Constants.PORT, scanner);
        }
    }
}


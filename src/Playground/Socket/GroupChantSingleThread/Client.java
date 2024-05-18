package Playground.Socket.GroupChantSingleThread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Client {
    public static void start(final int port, Scanner scanner){
        try(var socketChannel = SocketChannel.open()){
            socketChannel.connect(new InetSocketAddress(port));
            System.out.println("Connection established");
            var buffer = ByteBuffer.allocate(1024);
            while(true){
                var line = scanner.nextLine();
                if(line.equalsIgnoreCase(":quit")){
                    break;
                }
                buffer.clear().put(line.getBytes()).flip();
                while (buffer.hasRemaining()){
                    socketChannel.write(buffer);
                }
                buffer.clear();
                var byteRead = socketChannel.read(buffer);
                if(byteRead > 0) {
                    buffer.flip();
                    var message = new String(buffer.array(), buffer.position(), byteRead);
                    System.out.println(message);
                }
                buffer.clear();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

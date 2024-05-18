package Playground.Socket.GroupChantSingleThread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.HashSet;

public class Server {
    public static void start(final int port) {
        var clients = new HashSet<SocketChannel>();
        try (var serverSocketChannel = ServerSocketChannel.open();
             var selector = Selector.open()) {
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress(port));
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            var buffer = ByteBuffer.allocate(1024);
            while (true) {
                if (selector.select() == 0) {
                    continue;
                }
                for (var key : selector.selectedKeys()) {
                    if (key.isAcceptable()) {
                        if (key.channel() instanceof ServerSocketChannel channel) {
                            var client = channel.accept();
                            var socket = client.socket();
                            var clientInfo = STR."\{socket.getInetAddress().getHostAddress()}:\{socket.getPort()}";
                            System.out.println(STR."\{clientInfo} connected");
                            client.configureBlocking(false);
                            client.register(selector, SelectionKey.OP_READ);
                            clients.add(client);
                        } else {
                            throw new RuntimeException("Unknown channel");
                        }
                    } else if (key.isReadable()) {
                        if (key.channel() instanceof SocketChannel client) {
                            var byteRead = client.read(buffer);
                            if (byteRead == -1) {
                                var socket = client.socket();
                                var clientInfo = STR."\{socket.getInetAddress().getHostAddress()}:\{socket.getPort()}";
                                System.out.println(STR."\{clientInfo} disconnected");
                            } else {
                                buffer.flip();
                                var message = new String(buffer.array(), buffer.position(), byteRead);
                                System.out.println(message);
                                while (buffer.hasRemaining()) {
                                    client.write(buffer);
                                }
                                buffer.clear();
                            }
                        } else {
                            throw new RuntimeException("Unknown channel");
                        }
                    }
                }
                selector.selectedKeys().clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            for (var client : clients) {
                try {
                    client.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
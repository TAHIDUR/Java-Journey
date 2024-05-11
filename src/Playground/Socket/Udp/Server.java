package Playground.Socket.Udp;

import static Utilities.Helper.*;
import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try (DatagramSocket socket = new DatagramSocket(9999)) {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            println(message);

            String res = ScanString();
            byte[] response = res.getBytes();
            DatagramPacket dPacket = new DatagramPacket(response, response.length, InetAddress.getLocalHost(), packet.getPort());
            socket.send(dPacket);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
